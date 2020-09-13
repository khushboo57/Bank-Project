package com.dxc.passwordchange;

public class PasswordChange {

	int accountNo;
	String oldPassword;
	String newPassword;
	
	
	public PasswordChange(int accountNo, String oldPassword, String newPassword) {
		super();
		this.accountNo = accountNo;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
	}


	public PasswordChange() {
		super();
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getOldPassword() {
		return oldPassword;
	}


	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}


	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	
	
	
}
