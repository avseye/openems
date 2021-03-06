package io.openems.impl.device.system.esscluster;

import java.util.HashSet;
import java.util.Set;

import io.openems.api.bridge.Bridge;
import io.openems.api.channel.ConfigChannel;
import io.openems.api.device.nature.DeviceNature;
import io.openems.api.doc.ChannelInfo;
import io.openems.api.doc.ThingInfo;
import io.openems.common.exceptions.OpenemsException;
import io.openems.impl.protocol.system.SystemDevice;

@ThingInfo(title = "Ess Cluster")
public class EssCluster extends SystemDevice {

	@ChannelInfo(title = "EssCluster", description = "Sets the cluster nature.", type = EssClusterNature.class)
	public final ConfigChannel<EssClusterNature> cluster = new ConfigChannel<EssClusterNature>("cluster", this).addChangeListener(this);

	public EssCluster(Bridge parent) throws OpenemsException {
		super(parent);
	}

	@Override
	protected Set<DeviceNature> getDeviceNatures() {
		Set<DeviceNature> natures = new HashSet<>();
		if (cluster.valueOptional().isPresent()) {
			natures.add(cluster.valueOptional().get());
		}
		return natures;
	}

}
