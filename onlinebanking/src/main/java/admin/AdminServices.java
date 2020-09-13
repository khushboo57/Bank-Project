package admin;

import java.util.ArrayList;

import org.bson.Document;

public class AdminServices {

	
	
	//Add amount to any user
	public static  void  addAmount(AddAmount addamnt)
	{
	int accountNo =	addamnt.getAccountNo();
	double amountToAdd= addamnt.getAmountToAdd();
	
	//System.out.println("accountNo is "+ accountNo);
	//System.out.println("amountToAdd is "+amountToAdd);
	AdminDatabase.updateBalance(accountNo, amountToAdd);
	
	
	}
	
	
	
	//Transfer amount from one account to another account
	public static void transferAmount(TransferAmount transferamount)
	{
		
	int debitAccNo =	transferamount.getDebitAccNo();
	int creditAccNo =   transferamount.getCreditAccNo();
	double addAmount =  transferamount.getAddAmount();
	
	AdminDatabase.updateBalance(creditAccNo, debitAccNo, addAmount);
	
	
	}
	
	
	
	
	
	
	
	
	// Check Account balance of any account.
	public static double getBalance(int accountNo)
	{
		  return AdminDatabase.returnBalance(accountNo);
	}
	
	
	
	
	
	
	
	
	
	//View Mobile change requests
	
	public static ArrayList getMobileRequest()
	{
		return AdminDatabase.returnMobileRequest();
	}
	
	
	
	
	
	
	
	
	
	
	//Verify mobile change requests.
	
	
	
	
	
	
	
	
	
	
	
	
}
