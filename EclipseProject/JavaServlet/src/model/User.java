package model;

public class User {
	private String usename;
	private String password;
	private String email;
	private String registerDay;
	private String birtday;
	
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegisterDay() {
		return registerDay;
	}
	public void setRegisterDay(String registerDay) {
		this.registerDay = registerDay;
	}
	public String getBirtday() {
		return birtday;
	}
	public void setBirtday(String birtday) {
		this.birtday = birtday;
	}
}
