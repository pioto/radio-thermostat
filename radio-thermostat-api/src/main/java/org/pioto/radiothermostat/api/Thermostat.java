/**
 * Copyright 2014 Mike Kelly
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pioto.radiothermostat.api;

public interface Thermostat {
	/**
	 * Gets the ambient temperature recorded by the thermostat.
	 *
	 * @return The current temperature in degrees Fahrenheit. If this cannot be
	 *         read, {@code null} will be returned.
	 */
	Float getTemperature();

	/**
	 * Returns the current operating mode of the thermostat. This is whether it
	 * is trying to heat or cool the room.
	 *
	 * @return the current operating mode. If this cannot be read, {@code null}
	 *         will be returned.
	 */
	OperatingMode getOperatingMode();

	/**
	 * Sets the desired operating mode of the thermostat. There may be some
	 * delay before this change takes effect.
	 *
	 * @param tmode
	 *            the new operating mode to set.
	 *
	 * @throws NullPointerException
	 *             if the given operating mode is {@code null}
	 */
	void setOperatingMode(OperatingMode tmode) throws NullPointerException;

}
