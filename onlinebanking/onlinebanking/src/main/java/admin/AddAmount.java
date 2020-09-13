package admin;

public class AddAmount {

	private int accountNo;
	private double amountToAdd;
	
	
	public AddAmount() {
		
	}


	public AddAmount(int accountNo, double amountToAdd) {
		super();
		this.accountNo = accountNo;
		this.amountToAdd = amountToAdd;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public double getAmountToAdd() {
		return amountToAdd;
	}


	public void setAmountToAdd(double amountToAdd) {
		this.amountToAdd = amountToAdd;
	}
	
	
}
