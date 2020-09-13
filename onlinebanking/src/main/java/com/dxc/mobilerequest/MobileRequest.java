package com.dxc.mobilerequest;

public class MobileRequest {

	int accountNo;
	String oldMobileNo;
	String newMobileNo;
	
	
	public MobileRequest() {
		
	}


	public MobileRequest(int accountNo, String oldMobileNo, String newMobileNo) {
		super();
		this.accountNo = accountNo;
		this.oldMobileNo = oldMobileNo;
		this.newMobileNo = newMobileNo;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getOldMobileNo() {
		return oldMobileNo;
	}


	public void setOldMobileNo(String oldMobileNo) {
		this.oldMobileNo = oldMobileNo;
	}


	public String getNewMobileNo() {
		return newMobileNo;
	}


	public void setNewMobileNo(String newMobileNo) {
		this.newMobileNo = newMobileNo;
	}
	
	
}
