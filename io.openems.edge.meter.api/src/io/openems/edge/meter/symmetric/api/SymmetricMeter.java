package io.openems.edge.meter.symmetric.api;

import io.openems.common.types.OpenemsType;
import io.openems.edge.common.channel.Channel;
import io.openems.edge.common.channel.doc.Doc;
import io.openems.edge.common.channel.doc.Unit;
import io.openems.edge.common.converter.StaticConverters;
import io.openems.edge.meter.api.Meter;

/**
 * Represents a Symmetric Meter.
 * 
 * - Negative ActivePower and ConsumptionActivePower represent Consumption, i.e.
 * power that is 'leaving the system', e.g. feed-to-grid
 * 
 * - Positive ActivePower and ProductionActivePower represent Production, i.e.
 * power that is 'entering the system', e.g. buy-from-grid
 * 
 * @author stefan.feilmeier
 *
 */
public interface SymmetricMeter extends Meter {

	public final static String POWER_DOC_TEXT = "Negative values for Consumption; positive for Production";

	public enum ChannelId implements io.openems.edge.common.channel.doc.ChannelId {
		/**
		 * Consumption Active Power
		 * 
		 * <ul>
		 * <li>Interface: Meter Symmetric
		 * <li>Type: Integer
		 * <li>Unit: W
		 * <li>Range: only positive values
		 * <li>Implementation Note: value is automatically derived from negative
		 * ACTIVE_POWER
		 * </ul>
		 */
		CONSUMPTION_ACTIVE_POWER(new Doc().type(OpenemsType.INTEGER).unit(Unit.WATT)), //
		/**
		 * Production Active Power
		 * 
		 * <ul>
		 * <li>Interface: Meter Symmetric
		 * <li>Type: Integer
		 * <li>Unit: W
		 * <li>Range: only positive values, derived from ACTIVE_POWER
		 * <li>Implementation Note: value is automatically derived from ACTIVE_POWER
		 * </ul>
		 */
		PRODUCTION_ACTIVE_POWER(new Doc().type(OpenemsType.INTEGER).unit(Unit.WATT)), //
		/**
		 * Active Power
		 * 
		 * <ul>
		 * <li>Interface: Meter Symmetric
		 * <li>Type: Integer
		 * <li>Unit: W
		 * <li>Range: negative values for Consumption (power that is 'leaving the
		 * system', e.g. feed-to-grid); positive for Production (power that is 'entering
		 * the system')
		 * </ul>
		 */
		ACTIVE_POWER(new Doc() //
				.type(OpenemsType.INTEGER) //
				.unit(Unit.WATT) //
				.text(POWER_DOC_TEXT) //
				.onInit(channel -> {
					channel.onSetNextValue(value -> {
						Object dischargeValue = StaticConverters.KEEP_POSITIVE.apply(value.get());
						channel.getComponent().channel(ChannelId.PRODUCTION_ACTIVE_POWER).setNextValue(dischargeValue);
						Object chargeValue = StaticConverters.INVERT.andThen(StaticConverters.KEEP_POSITIVE)
								.apply(value.get());
						channel.getComponent().channel(ChannelId.CONSUMPTION_ACTIVE_POWER).setNextValue(chargeValue);
					});
				})), //
		/**
		 * Consumption Reactive Power
		 * 
		 * <ul>
		 * <li>Interface: Meter Symmetric
		 * <li>Type: Integer
		 * <li>Unit: var
		 * <li>Range: only positive values
		 * <li>Implementation Note: value is automatically derived from negative
		 * REACTIVE_POWER
		 * </ul>
		 */
		CONSUMPTION_REACTIVE_POWER(new Doc().type(OpenemsType.INTEGER).unit(Unit.VOLT_AMPERE_REACTIVE)), //
		/**
		 * Production Reactive Power
		 * 
		 * <ul>
		 * <li>Interface: Meter Symmetric
		 * <li>Type: Integer
		 * <li>Unit: var
		 * <li>Range: only positive values
		 * <li>Implementation Note: value is automatically derived from REACTIVE_POWER
		 * </ul>
		 */
		PRODUCTION_REACTIVE_POWER(new Doc().type(OpenemsType.INTEGER).unit(Unit.VOLT_AMPERE_REACTIVE)), //
		/**
		 * Reactive Power
		 * 
		 * <ul>
		 * <li>Interface: Meter Symmetric
		 * <li>Type: Integer
		 * <li>Unit: var
		 * <li>Range: negative values for Consumption (power that is 'leaving the
		 * system', e.g. feed-to-grid); positive for Production (power that is 'entering
		 * the system')
		 * </ul>
		 */
		REACTIVE_POWER(new Doc().type(OpenemsType.INTEGER) //
				.unit(Unit.VOLT_AMPERE_REACTIVE) //
				.text(POWER_DOC_TEXT) //
				.onInit(channel -> {
					channel.onSetNextValue(value -> {
						Object dischargeValue = StaticConverters.KEEP_POSITIVE.apply(value.get());
						channel.getComponent().channel(ChannelId.PRODUCTION_REACTIVE_POWER)
								.setNextValue(dischargeValue);
						Object chargeValue = StaticConverters.INVERT.andThen(StaticConverters.KEEP_POSITIVE)
								.apply(value.get());
						channel.getComponent().channel(ChannelId.CONSUMPTION_REACTIVE_POWER).setNextValue(chargeValue);
					});
				})),
		/**
		 * Voltage
		 * 
		 * <ul>
		 * <li>Interface: Meter Symmetric
		 * <li>Type: Integer
		 * <li>Unit: mV
		 * </ul>
		 */
		VOLTAGE(new Doc().type(OpenemsType.INTEGER).unit(Unit.MILLIVOLT)), //
		/**
		 * Current
		 * 
		 * <ul>
		 * <li>Interface: Meter Symmetric
		 * <li>Type: Integer
		 * <li>Unit: mA
		 * </ul>
		 */
		CURRENT(new Doc().type(OpenemsType.INTEGER).unit(Unit.MILLIAMPERE)); //

		private final Doc doc;

		private ChannelId(Doc doc) {
			this.doc = doc;
		}

		public Doc doc() {
			return this.doc;
		}
	}

	/**
	 * Gets the Active Power in [W]. Negative values for Consumption; positive for
	 * Production
	 * 
	 * @return
	 */
	default Channel<Integer> getActivePower() {
		return this.channel(ChannelId.ACTIVE_POWER);
	}

	/**
	 * Gets the Consumption Active Power in [W]. This is derived from negative
	 * 'getActivePower()' values; 0 for positive.
	 * 
	 * @return
	 */
	default Channel<Integer> getConsumptionActivePower() {
		return this.channel(ChannelId.CONSUMPTION_ACTIVE_POWER);
	}

	/**
	 * Gets the Production Active Power in [W]. This is derived from positive
	 * 'getActivePower()' values; 0 for negative.
	 * 
	 * @return
	 */
	default Channel<Integer> getProductionActivePower() {
		return this.channel(ChannelId.PRODUCTION_ACTIVE_POWER);
	}

	/**
	 * Gets the Reactive Power in [var]. Negative values for Consumption; positive
	 * for Production.
	 * 
	 * @return
	 */
	default Channel<Integer> getReactivePower() {
		return this.channel(ChannelId.REACTIVE_POWER);
	}

	/**
	 * Gets the Consumption Reactive Power in [var]. This is derived from negative
	 * 'getReactivePower()' values; 0 for positive.
	 * 
	 * @return
	 */
	default Channel<Integer> getConsumptionReactivePower() {
		return this.channel(ChannelId.CONSUMPTION_REACTIVE_POWER);
	}

	/**
	 * Gets the Production Reactive Power in [var]. This is derived from positive
	 * 'getReactivePower()' values; 0 for negative.
	 * 
	 * @return
	 */
	default Channel<Integer> getProductionReactivePower() {
		return this.channel(ChannelId.PRODUCTION_REACTIVE_POWER);
	}

}
