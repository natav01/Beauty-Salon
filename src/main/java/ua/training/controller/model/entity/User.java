package ua.training.controller.model.entity;



public class  User extends Entity {
	
	 private ROLE role;
	 public enum ROLE {
		 ADMIN, CLIENT, MASTER, GUEST;
	    }
	private String login;

	private String password;

	private String firstName;

	private String lastName;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public ROLE getRole() { return role; }

    public void setRole(ROLE role) { this.role = role; }
	private String phoneNumber;

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
	}
}
