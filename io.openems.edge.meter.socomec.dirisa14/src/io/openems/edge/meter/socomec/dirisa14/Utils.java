package io.openems.edge.meter.socomec.dirisa14;

import java.util.Arrays;
import java.util.stream.Stream;

import io.openems.edge.common.channel.AbstractReadChannel;
import io.openems.edge.common.channel.IntegerReadChannel;
import io.openems.edge.common.channel.StateChannel;
import io.openems.edge.common.component.OpenemsComponent;
import io.openems.edge.meter.api.Meter;
import io.openems.edge.meter.asymmetric.api.AsymmetricMeter;
import io.openems.edge.meter.symmetric.api.SymmetricMeter;

public class Utils {
	public static Stream<? extends AbstractReadChannel<?>> initializeChannels(MeterSocomecDirisA14 c) {
		return Stream.of( //
				Arrays.stream(OpenemsComponent.ChannelId.values()).map(channelId -> {
					switch (channelId) {
					case STATE:
						return new StateChannel(c, channelId);
					}
					return null;
				}), Arrays.stream(Meter.ChannelId.values()).map(channelId -> {
					switch (channelId) {
					case FREQUENCY:
						return new IntegerReadChannel(c, channelId);
					}
					return null;
				}), Arrays.stream(SymmetricMeter.ChannelId.values()).map(channelId -> {
					switch (channelId) {
					case ACTIVE_POWER:
					case REACTIVE_POWER:
					case CONSUMPTION_ACTIVE_POWER:
					case CONSUMPTION_REACTIVE_POWER:
					case PRODUCTION_ACTIVE_POWER:
					case PRODUCTION_REACTIVE_POWER:
					case CURRENT:
					case VOLTAGE:
						return new IntegerReadChannel(c, channelId);
					}
					return null;
				}), Arrays.stream(AsymmetricMeter.ChannelId.values()).map(channelId -> {
					switch (channelId) {
					case ACTIVE_POWER_L1:
					case ACTIVE_POWER_L2:
					case ACTIVE_POWER_L3:
					case CONSUMPTION_ACTIVE_POWER_L1:
					case CONSUMPTION_ACTIVE_POWER_L2:
					case CONSUMPTION_ACTIVE_POWER_L3:
					case CONSUMPTION_REACTIVE_POWER_L1:
					case CONSUMPTION_REACTIVE_POWER_L2:
					case CONSUMPTION_REACTIVE_POWER_L3:
					case PRODUCTION_ACTIVE_POWER_L1:
					case PRODUCTION_ACTIVE_POWER_L2:
					case PRODUCTION_ACTIVE_POWER_L3:
					case PRODUCTION_REACTIVE_POWER_L1:
					case PRODUCTION_REACTIVE_POWER_L2:
					case PRODUCTION_REACTIVE_POWER_L3:
					case REACTIVE_POWER_L1:
					case REACTIVE_POWER_L2:
					case REACTIVE_POWER_L3:
					case CURRENT_L1:
					case CURRENT_L2:
					case CURRENT_L3:
					case VOLTAGE_L1:
					case VOLTAGE_L2:
					case VOLTAGE_L3:
						return new IntegerReadChannel(c, channelId);
					}
					return null;
				})/*
					 * , Arrays.stream(MeterSocomecDirisA14.ChannelId.values()).map(channelId -> {
					 * switch (channelId) { } return null; })
					 */ //
		).flatMap(channel -> channel);
	}
}
