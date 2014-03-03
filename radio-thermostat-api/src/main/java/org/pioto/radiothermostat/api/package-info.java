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

/**
 * This package contains interfaces for a public API for the
 * <a href="http://www.radiothermostat.com/latestnews.html#advanced">Radio Thermostat</a>.
 * <p/>
 * The main interface for interacting with the thermostat is the
 * {@link org.pioto.radiothermostat.api.Thermostat} interface. Implementations
 * should register as an OSGi service.
 *
 * @author Mike Kelly (pioto@pioto.org)
 */
package org.pioto.radiothermostat.api;