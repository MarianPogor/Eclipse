package model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String name;
	private long ssn;
	private int phoneNr;
	private long mngrSSN;
	private String username;
	private String password;
	
	public Employee(String name, long ssn, int phoneNr, long mngrSSN, String username, String password) {
		this.name = name;
		this.ssn = ssn;
		this.phoneNr = phoneNr;
		this.mngrSSN = mngrSSN;
		this.username = username;
		this.password = password;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMngrSSN(long mngrSSN) {
		this.mngrSSN = mngrSSN;
	}
	
	public void setPhoneNr(int phoneNr) {
		this.phoneNr = phoneNr;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public long getSsn() {
		return ssn;
	}
	public int getPhoneNr() {
		return phoneNr;
	}
	public long getMngrSSN() {
		return mngrSSN;
	}
public String getPassword() {
	return password;
}
public String getUsername() {
	return username;
}
public String getEmployeeLoginInfo()
{
	return "\nUsername: "+ username + "\nPassword: " + password;
}
	public boolean equals(Object obj)
{
	if(!(obj instanceof Employee))
		return false;
	
	Employee other = (Employee) obj;
	
	return name.equals(other.name) && ssn == other.ssn && phoneNr == other.phoneNr
			&& mngrSSN == other.mngrSSN && username.equals(other.username) && password.equals(other.password);
}
	public String toString()
	{
		return "\nName: "+name + "\nSSN: " + ssn + "\nPhone nr: " + phoneNr 
				+ "\nManager SSN: " + mngrSSN + "\nUsername: " + username 
				+ "\nPassword: " + password;
	}
}
