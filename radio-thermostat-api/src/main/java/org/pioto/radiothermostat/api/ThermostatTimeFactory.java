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

import java.util.Calendar;
import java.util.Date;

/**
 * Factory for creating new ThermostatTime instances.
 *
 * @author Mike Kelly (pioto@pioto.org)
 *
 */
public interface ThermostatTimeFactory {
	/**
	 * Creates a new ThermostatTime instance that represents the current time.
	 *
	 * @return a new, immutable ThermostatTime
	 */
	ThermostatTime createTime();

	/**
	 * Creates a new ThermostatTime instance that represents the time in the
	 * given Date object.
	 *
	 * @param date
	 *            the date to use to create the new ThermostatTime
	 * @return a new, immutable ThermostatTime
	 */
	ThermostatTime createTime(Date date);

	/**
	 * Creates a new ThermostatTime instance that represents the time in the
	 * given Calendar object.
	 *
	 * @param cal
	 *            the calendar to use to create the new ThermostatTime
	 * @return a new, immutable ThermostatTime
	 */
	ThermostatTime createTime(Calendar cal);
}
