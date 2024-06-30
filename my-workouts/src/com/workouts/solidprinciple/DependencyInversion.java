package com.workouts.solidprinciple;

public class DependencyInversion {

}

//Before DIP
/*
public class LightBulb {
 public void turnOn() {
     // turning on code
 }

 public void turnOff() {
     // turning off code
 }
}

public class Switch {
 private LightBulb bulb;

 public Switch(LightBulb bulb) {
     this.bulb = bulb;
 }

 public void operate() {
     // toggle bulb state
 }
}
*/

//After DIP
interface Switchable {
	void turnOn();

	void turnOff();
}

class LightBulb implements Switchable {
	@Override
	public void turnOn() {
		// turning on code
	}

	@Override
	public void turnOff() {
		// turning off code
	}
}

class Switch {
	private Switchable device;

	public Switch(Switchable device) {
		this.device = device;
	}

	public void operate() {
		device.turnOn();
		device.turnOff();
	}
}
