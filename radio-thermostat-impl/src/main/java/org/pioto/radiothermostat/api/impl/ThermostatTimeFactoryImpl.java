package org.pioto.radiothermostat.api.impl;

import java.util.Calendar;
import java.util.Date;

import org.pioto.radiothermostat.api.ThermostatTime;
import org.pioto.radiothermostat.api.ThermostatTimeFactory;

public class ThermostatTimeFactoryImpl implements ThermostatTimeFactory {

	public ThermostatTime createTime() {
		return createTime(new Date());
	}

	public ThermostatTime createTime(Date date) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented");
	}

	public ThermostatTime createTime(Calendar cal) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented");
	}

}
