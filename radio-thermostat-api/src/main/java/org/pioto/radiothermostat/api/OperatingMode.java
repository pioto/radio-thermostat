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

/**
 * Type representing the operating mode of the thermostat.
 *
 * @author Mike Kelly (pioto@pioto.org)
 *
 */
public enum OperatingMode {
	/**
	 * Thermostat is currently switched off.
	 */
	OFF,
	/**
	 * Thermostat is currently in heat mode.
	 */
	HEAT,
	/**
	 * Thermostat is currently in cool mode.
	 */
	COOL,
	/**
	 * Thermostat is currently in "auto" mode, and will switch between heating
	 * and cooling as required.
	 * <p/>
	 * Not all models support this mode.
	 */
	AUTO
}
