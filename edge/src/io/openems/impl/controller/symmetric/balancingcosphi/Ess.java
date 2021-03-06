/*******************************************************************************
 * OpenEMS - Open Source Energy Management System
 * Copyright (c) 2016 FENECON GmbH and contributors
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
package io.openems.impl.controller.symmetric.balancingcosphi;

import io.openems.api.channel.ReadChannel;
import io.openems.api.controller.IsThingMap;
import io.openems.api.controller.ThingMap;
import io.openems.api.device.nature.ess.SymmetricEssNature;
import io.openems.core.utilities.power.symmetric.CosPhiLineLimitation;
import io.openems.core.utilities.power.symmetric.SymmetricPower;

@IsThingMap(type = SymmetricEssNature.class)
public class Ess extends ThingMap {

	public final ReadChannel<Long> reactivePower;
	public final ReadChannel<Long> activePower;
	public final String id;
	public final ReadChannel<Long> allowedCharge;
	public final ReadChannel<Long> allowedDischarge;
	public final SymmetricPower power;
	public final CosPhiLineLimitation limit;

	public Ess(SymmetricEssNature ess) {
		super(ess);
		id = ess.id();
		allowedCharge = ess.allowedCharge();
		allowedDischarge = ess.allowedDischarge();
		reactivePower = ess.reactivePower();
		activePower = ess.activePower();
		this.power = ess.getPower();
		this.limit = new CosPhiLineLimitation(power);
	}

}
