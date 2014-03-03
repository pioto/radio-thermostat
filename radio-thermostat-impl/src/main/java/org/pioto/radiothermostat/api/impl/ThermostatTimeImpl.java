package org.pioto.radiothermostat.api.impl;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.pioto.radiothermostat.api.DayOfWeek;
import org.pioto.radiothermostat.api.ThermostatTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ThermostatTimeImpl implements ThermostatTime {
	private static final long serialVersionUID = 6608213795243913051L;

	private final DayOfWeek day;
	private final Integer hour;
	private final Integer minutes;

	@JsonCreator
	public ThermostatTimeImpl(@JsonProperty("day") DayOfWeek day,
			@JsonProperty("hour") Integer hour,
			@JsonProperty("minutes") Integer minutes) {
		this.day = day;
		this.hour = hour;
		this.minutes = minutes;
	}

	public int compareTo(ThermostatTime o) {
		ThermostatTime rhs = (ThermostatTime) o;
		return new CompareToBuilder().append(this.day, rhs.getDay())
				.append(this.hour, rhs.getHour())
				.append(this.minutes, rhs.getMinutes()).build();
	}

	public DayOfWeek getDay() {
		return day;
	}

	public Integer getHour() {
		return hour;
	}

	public Integer getMinutes() {
		return minutes;
	}

}
