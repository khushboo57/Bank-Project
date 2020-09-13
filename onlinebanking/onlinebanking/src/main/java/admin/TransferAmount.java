package admin;

public class TransferAmount {

	int debitAccNo;
	int creditAccNo;
	double addAmount;
	
	
	
	public TransferAmount() {
		
	}



	public TransferAmount(int debitAccNo, int creditAccNo, double addAmount) {
		super();
		this.debitAccNo = debitAccNo;
		this.creditAccNo = creditAccNo;
		this.addAmount = addAmount;
	}



	public int getDebitAccNo() {
		return debitAccNo;
	}



	public void setDebitAccNo(int debitAccNo) {
		this.debitAccNo = debitAccNo;
	}



	public int getCreditAccNo() {
		return creditAccNo;
	}



	public void setCreditAccNo(int creditAccNo) {
		this.creditAccNo = creditAccNo;
	}



	public double getAddAmount() {
		return addAmount;
	}



	public void setAddAmount(double addAmount) {
		this.addAmount = addAmount;
	}
	
	
	
}
