package ai.privado.demo.accounts.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignupD {
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	private String phone;
	private String password;
	private String dob;
	private String ssn; 
	private String email;
	private String gender;


	public String getgender(){
		return gender; 
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getemail(){
		return email; 
	}

	public void setemail(String email) {
		this.email = email;
	}
	

	public String getssn(){
		return ssn; 
	}
	
	public void setssn(String ssn) {
		this.ssn = ssn;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
