package sobrecarga;

public class User {
	private String firstname;
	private String lastname;
	public User(String firstName, String lastName) {
		this.firstname = firstName;
		this.lastname = lastName;
	};
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	};
	public void setLastName(String lastName) {
		this.lastname = lastName;
	};
	public String getFirstName() {
		return this.firstname;
	};
	public String getLastName() {
		return this.lastname;
	};
	
	// Sobrecarga
	public String output() {
		return this.firstname.toUpperCase() + " " + this.lastname.toUpperCase();
	}
	public String output(boolean showLastName) {
		if (showLastName == true) {
			return output();
		}
		return this.firstname;
	}
	public String toString() {
		return "User {" +
				"firstName=" + this.firstname + "," + "lastName=" + this.lastname + "}";
	}
}
