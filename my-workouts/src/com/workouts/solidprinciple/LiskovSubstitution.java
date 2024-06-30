package com.workouts.solidprinciple;

public class LiskovSubstitution {

}
//Before LSP
/*
public class Bird {
 public void fly() {
     // flying code
 }
}

public class Ostrich extends Bird {
 @Override
 public void fly() {
     throw new UnsupportedOperationException("Ostrich can't fly");
 }
}
*/

//After LSP
class Bird {
	// Bird properties and methods
}

class FlyingBird extends Bird {
	public void fly() {
		// flying code
	}
}

class Ostrich extends Bird {
	// Ostrich-specific properties and methods
}
