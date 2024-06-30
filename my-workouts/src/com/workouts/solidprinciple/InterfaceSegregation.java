package com.workouts.solidprinciple;

public class InterfaceSegregation {

}

//Before ISP
/*
public interface Worker {
 void work();
 void eat();
}

public class HumanWorker implements Worker {
 @Override
 public void work() {
     // working code
 }

 @Override
 public void eat() {
     // eating code
 }
}

public class RobotWorker implements Worker {
 @Override
 public void work() {
     // working code
 }

 @Override
 public void eat() {
     throw new UnsupportedOperationException("Robots don't eat");
 }
}

*/

//After ISP
interface Workable {
	void work();
}

interface Eatable {
	void eat();
}

class HumanWorker implements Workable, Eatable {
	@Override
	public void work() {
		// working code
	}

	@Override
	public void eat() {
		// eating code
	}
}

class RobotWorker implements Workable {
	@Override
	public void work() {
		// working code
	}
}
