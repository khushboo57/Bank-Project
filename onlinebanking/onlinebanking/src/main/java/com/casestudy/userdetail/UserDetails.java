package com.casestudy.userdetail;

public class UserDetails {

	  private   String name;
	  private   String mobile;
	  private   String email;
	  private   String aadharNo;
	  private   String address;
	  private   String password;
	  
	  
	  
	  
	public UserDetails() {
		
	}




	public UserDetails(String name, String mobile, String email, String aadharNo, String address, String password) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.aadharNo = aadharNo;
		this.address = address;
		this.password = password;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getMobile() {
		return mobile;
	}




	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getAadharNo() {
		return aadharNo;
	}




	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}


	


	


	
	
}
