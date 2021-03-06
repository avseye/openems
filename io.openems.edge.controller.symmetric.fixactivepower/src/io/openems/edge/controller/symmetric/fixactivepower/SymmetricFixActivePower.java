package io.openems.edge.controller.symmetric.fixactivepower;

import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.openems.common.exceptions.OpenemsException;
import io.openems.edge.common.component.AbstractOpenemsComponent;
import io.openems.edge.common.component.OpenemsComponent;
import io.openems.edge.controller.api.Controller;
import io.openems.edge.ess.power.symmetric.PEqualLimitation;
import io.openems.edge.ess.power.symmetric.SymmetricPower;
import io.openems.edge.ess.symmetric.api.SymmetricEss;

@Designate(ocd = Config.class, factory = true)
@Component(name = "Controller.Symmetric.FixActivePower", immediate = true, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class SymmetricFixActivePower extends AbstractOpenemsComponent implements Controller, OpenemsComponent {

	private final Logger log = LoggerFactory.getLogger(SymmetricFixActivePower.class);

	@Reference
	protected ConfigurationAdmin cm;

	/**
	 * the configured Charge ActivePower
	 * 
	 * negative values for Charge; positive for Discharge
	 */
	private int power = 0;

	@Activate
	void activate(ComponentContext context, Config config) {
		super.activate(context, config.service_pid(), config.id(), config.enabled());
		// update filter for 'ess'
		if (OpenemsComponent.updateReferenceFilter(cm, config.service_pid(), "ess", config.ess_id())) {
			return;
		}

		this.power = config.power();
	}

	@Reference(policy = ReferencePolicy.STATIC, policyOption = ReferencePolicyOption.GREEDY, cardinality = ReferenceCardinality.MANDATORY)
	private SymmetricEss ess;

	@Deactivate
	protected void deactivate() {
		super.deactivate();
	}

	@Override
	public void run() {
		try {
			SymmetricPower power = ess.getPower();
			power.applyLimitation(new PEqualLimitation(power).setP(this.power));
		} catch (OpenemsException e) {
			logError(log, e.getMessage());
		}
	}
}
