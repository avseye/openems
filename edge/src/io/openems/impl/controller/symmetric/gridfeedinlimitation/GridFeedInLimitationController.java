/*******************************************************************************
 * OpenEMS - Open Source Energy Management System
 * Copyright (c) 2016, 2017 FENECON GmbH and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *   FENECON GmbH - initial API and implementation and initial documentation
 *******************************************************************************/
package io.openems.impl.controller.symmetric.gridfeedinlimitation;

import io.openems.api.channel.ConfigChannel;
import io.openems.api.channel.thingstate.ThingStateChannels;
import io.openems.api.controller.Controller;
import io.openems.api.doc.ChannelInfo;
import io.openems.api.doc.ThingInfo;
import io.openems.api.exception.InvalidValueException;
import io.openems.core.utilities.power.symmetric.PowerException;

@ThingInfo(title = "", description = "Calulates maximal Ess power to avoid grid feed in.")
public class GridFeedInLimitationController extends Controller {

	private ThingStateChannels thingState = new ThingStateChannels(this);

	/*
	 * Constructors
	 */
	public GridFeedInLimitationController() {
		super();
	}

	public GridFeedInLimitationController(String thingId) {
		super(thingId);
	}

	/*
	 * Config
	 */
	@ChannelInfo(title = "Ess", description = "Sets the Ess devices.", type = Ess.class)
	public final ConfigChannel<Ess> ess = new ConfigChannel<Ess>("ess", this);

	@ChannelInfo(title = "Grid-Meter", description = "Sets the grid meter.", type = Meter.class)
	public final ConfigChannel<Meter> meter = new ConfigChannel<Meter>("meter", this);

	@ChannelInfo(title = "Max GridFeedIn", description = "The max allowed power feed in to grid.", type = Long.class)
	public final ConfigChannel<Long> maxGridFeedIn = new ConfigChannel<>("maxGridFeedIn", this);

	/*
	 * Methods
	 */

	@Override
	public void run() {
		try {
			long maxPower = ess.value().activePower.value() + meter.value().activePower.value() + maxGridFeedIn.value();
			ess.value().limit.setP(maxPower);
			ess.value().power.applyLimitation(ess.value().limit);
		} catch (InvalidValueException e) {
			log.error(e.getMessage());
		} catch (PowerException e) {
			log.error("Failed to set Power!", e);
		}
	}

	@Override
	public ThingStateChannels getStateChannel() {
		return this.thingState;
	}

}
