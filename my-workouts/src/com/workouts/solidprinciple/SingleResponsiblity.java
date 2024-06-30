package com.workouts.solidprinciple;

public class SingleResponsiblity {

}

//Before SRP
/*
class User {
 public void saveUser() {
     // code to save user to database
 }

 public void sendEmail() {
     // code to send email to user
 }
}
*/

//After SRP
class User {
	// User properties and methods
}

class UserRepository {
	public void saveUser(User user) {
		// code to save user to database
	}
}

class EmailService {
	public void sendEmail(User user) {
		// code to send email to user
	}
}

/*
 * Explanation:
The User class originally had two responsibilities: saving a user to a database and sending an email. By applying SRP, we separated these responsibilities into UserRepository and EmailService classes.
*/

