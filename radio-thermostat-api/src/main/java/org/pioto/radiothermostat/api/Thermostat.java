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
 * The main interface for interacting with the thermostat.
 *
 * @author Mike Kelly (pioto@pioto.org)
 *
 */
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
	 * @throws NullPointerException
	 *             if the given operating mode is {@code null}
	 */
	void setOperatingMode(OperatingMode tmode) throws NullPointerException;

	/**
	 * Returns the current fan operating mode of the thermostat. This when the
	 * thermostat requests the fan to be on.
	 *
	 * @return the current fan operating mode. If this cannot be read,
	 *         {@code null} will be returned.
	 */
	FanMode getFanMode();

	/**
	 * Sets the desired fan operating mode of the thermostat. There may be some
	 * delay before this change takes effect.
	 *
	 * @param fmode
	 *            the new fan operating mode to set
	 * @throws NullPointerException
	 *             if the given fan operating mode is {@code null}
	 */
	void setFanMode(FanMode fmode) throws NullPointerException;

	/**
	 * Get the status of the target temperature temporary override.
	 *
	 * @return {@code true} if override is enabled, {@code false} if it is
	 *         disabled, and {@code null} if the current state cannot be
	 *         determined.
	 */
	Boolean getOverrideMode();

	/**
	 * Get the target temperature hold status. If this is enabled, then any
	 * other thermostat programs will not engage. If disabled, then any
	 * temperature overrides will be removed when the next program starts.
	 *
	 * @return {@code true} if hold is enabled, {@code false} if it is disabled,
	 *         and {@code null} if the current state cannot be dtermined.
	 * @see Thermostat#getOverrideMode()
	 */
	Boolean getHoldStatus();

	/**
	 * Sets the current hold status.
	 *
	 * @param hold
	 *            the hold status to set.
	 * @throws NullPointerException
	 *             if the given hold status is {@code null}
	 */
	void setHoldStatus(Boolean hold) throws NullPointerException;

	/**
	 * Gets the current temporary heat target.
	 *
	 * @return the current heat target, or {@code null} if the value cannot be
	 *         determined.
	 */
	Float getTemporaryHeatTarget();

	/**
	 * Sets the current temporary heating target. If the operating mode is not
	 * currently {@link OperatingMode#HEAT}, then it will be set to that.
	 *
	 * @param t_heat
	 *            the new temporary heat target to use
	 * @throws NullPointerException
	 *             if the given target temperature is {@code null}
	 */
	void setTemporaryHeatTarget(Float t_heat) throws NullPointerException;

	/**
	 * Gets the current temporary cooling target.
	 *
	 * @return the current cooling target, or {@code null} if the value cannot
	 *         be determined.
	 */
	Float getTemporaryCoolTarget();

	/**
	 * Sets the current temporary cooling target. If the operating mode is not
	 * currently {@link OperatingMode#COOL}, then it will be set to that.
	 *
	 * @param t_cool
	 *            the new temporary cooling target to use
	 * @throws NullPointerException
	 *             if the given target temperature is {@code null}
	 */
	void setTemporaryCoolTarget(Float t_cool) throws NullPointerException;

	/**
	 * Gets the current state of the thermostat (e.g. heating, cooling, off).
	 *
	 * @return the current thermostat state, or {@code null} if it cannot be
	 *         determined.
	 */
	ThermostatState getThermostatState();

	/**
	 * Gets the current state of the fan.
	 *
	 * @return {@code true} if the fan is on, {@code false} if the fan is off,
	 *         and {@code null} if the current state cannot be determined.
	 */
	Boolean getFanState();

	/**
	 * Gets the current time, according to the thermostat.
	 *
	 * @return the current time, or {@code null} if it cannot be determined.
	 */
	ThermostatTime getThermostatTime();

	/**
	 * Sets the thermostat's time to the given time.
	 *
	 * @param time
	 *            the time to set
	 * @throws NullPointerException
	 *             if the give time is {@code null}
	 */
	void setThermostatTime(ThermostatTime time) throws NullPointerException;

	/**
	 * Gets the thermostat's model string.
	 *
	 * @return the thermostat's model, or {@code null} if it cannot be
	 *         determined.
	 */
	String getThermostatModel();

	/**
	 * Gets information about the thermostat system.
	 *
	 * @return thermostat system info, or {@code null} if it is not available.
	 */
	SystemInfo getSystemInfo();
}
