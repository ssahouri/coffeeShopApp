package co.grandcircus.coffeeshop;

public class User {
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String password;
	private String cupsPerDay;
	
	public User() {}
	
	public User(String firstName, String lastName, String username, String email, String password, String cupsPerDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.cupsPerDay = cupsPerDay;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCupsPerDay() {
		return cupsPerDay;
	}
	public void setCupsPerDay(String cupsPerDay) {
		this.cupsPerDay = cupsPerDay;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", email=" + email
				+ ", password=" + password + ", cupsPerDay=" + cupsPerDay + "]";
	}
	
	

}
