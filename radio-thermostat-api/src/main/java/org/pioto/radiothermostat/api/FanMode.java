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
 * An enum representing the different possible fan modes for the thermostat.
 *
 * @author Mike Kelly (pioto@pioto.org)
 *
 */
public enum FanMode {
	/**
	 * The fan turns on automatically when needed for heating or cooling.
	 */
	AUTO,
	/**
	 * The fan turns on automatically when needed for heating or cooling, and
	 * also turns on automatically to circulate air occasionally.
	 * <p/>
	 * This mode is not available on all thermostats.
	 */
	AUTO_CIRCULATE,
	/**
	 * The fan is always running.
	 */
	ON
}
