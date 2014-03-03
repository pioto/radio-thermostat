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
 * Represents some basic information about the thermostat system.
 *
 * @author Mike Kelly (pioto@pioto.org)
 *
 */
public interface SystemInfo extends Serializable {
	/**
	 * Gets the unique identifier for the device.
	 *
	 * @return the uuid
	 */
	String getUUID();

	/**
	 * Gets the HTTP API version supported by the device.
	 *
	 * @return the supported API version.
	 */
	Integer getAPIVersion();

	/**
	 * Gets the firmware version.
	 *
	 * @return the firmware version.
	 */
	String getFirmwareVersion();

	/**
	 * Gets the underlying WLAN firmware version, which is referred to in WiFI
	 * certification documentation.
	 *
	 * @return the WLAN firmware version string.
	 */
	String getWlanFirmwareVersion();

	/**
	 * Gets the descriptive system name of the thermostat.
	 *
	 * @return the name (e.g. {@code "thermostat-2D-97-8f"} or
	 *         {@code "Dining Room"})
	 */
	String getName();
}
