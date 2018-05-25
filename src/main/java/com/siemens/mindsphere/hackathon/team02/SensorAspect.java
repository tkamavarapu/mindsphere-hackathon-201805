package com.siemens.mindsphere.hackathon.team02;

import java.sql.Timestamp;

public class SensorAspect {

	public Double Voltage;
	public Double Current;
	public Timestamp _time;
	public Double getVoltage() {
		return Voltage;
	}
	public void setVoltage(Double voltage) {
		Voltage = voltage;
	}
	public Double getCurrent() {
		return Current;
	}
	public void setCurrent(Double current) {
		Current = current;
	}
	public Timestamp get_time() {
		return _time;
	}
	public void set_time(Timestamp _time) {
		this._time = _time;
	}
	
	
	
}
