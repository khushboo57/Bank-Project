package com.casestudy.userdetail;

import org.bson.Document;

import com.casestudy.dbconnection.DatabaseConnection;
import com.casestudy.mapper.Adapter;
import com.casestudy.mapper.RequestMapper;
import com.dxc.mobilerequest.MobileRequest;

import admin.AdminDatabase;


public class UserServices {

	//getting value of  last account number
	public static double getLastAccNo()
	{
		
		Document doc=UserDatabase.getLastDocument();
		
	double accNo =doc.getDouble("accountNo");
		return accNo;
	}
	
	
	// User Registration
	public static void addUser(UserDetails user)
	{
		   Document doc = Adapter.toDocumentObject(user);
		   UserDatabase.addDocument(doc);
	}
	
	
	// Transfer Amount to another acccount
	
	
	
	
	
	
	
	//Request for mobile change
         public static void mobChangeRequest(MobileRequest mobreq)
         {
        	 Document doc = RequestMapper.toDocumentObject(mobreq);
        	  UserDatabase.addmobilereq(doc);
        	 
         }
	
	
	
	
	
	
	//change password
	
	public static Boolean updatePassword(Document doc){
		String oldPass=doc.getString("oldPassword");
		String newPass=doc.getString("newPassword");
		
		return UserDatabase.updatePassword(oldPass,newPass);
		
		
	} 
	
	
	
	
	
	// view account balance
	public static double getBalance(int accountNo)
	{
		  return UserDatabase.returnBalance(accountNo);
	}
	
	
	
	
	
	
	
	
	
// 	Document doc=pCollection.find().sort(new BasicDBObject("accountNo", -1)).first();
//  double acc= doc.getDouble("accountNo");
	
//	static {
//		DatabaseConnection.connect();
//	}
//	
//	    public static void addUser(UserDetails user)
//	    {
//	    	Document doc = Adapter.toDocumentObject(user);
//	    	//String accountNum=doc.getString("id");
//	    	DatabaseConnection.addUser(doc);
//	    	
//	    }
//	
}
