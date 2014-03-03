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

import java.io.Serializable;

/**
 * Interface representing the time, as tracked by the thermostat.
 * <p/>
 * The thermostat only tracks the day of the week, and the current hour/minute
 * of the day.
 *
 * @author Mike Kelly (pioto@pioto.org)
 *
 */
public interface ThermostatTime extends Serializable,
		Comparable<ThermostatTime> {

	/**
	 * The day of the week this time represents.
	 *
	 * @return the day of the week
	 */
	DayOfWeek getDay();

	/**
	 * The hour of the day this time represents, in hours since midnight. (e.g.
	 * {@code 0} = "12 AM", {@code 13} = "1PM")
	 *
	 * @return the hour
	 */
	Integer getHour();

	/**
	 * The number of minutes past the hour for this time.
	 *
	 * @return the minutes
	 */
	Integer getMinutes();
}
