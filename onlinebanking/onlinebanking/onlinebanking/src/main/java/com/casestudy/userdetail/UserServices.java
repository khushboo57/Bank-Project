package com.casestudy.userdetail;

import org.bson.Document;

import com.casestudy.dbconnection.DatabaseConnection;
import com.casestudy.mapper.Adapter;

public class UserServices {

	
	public static double getLastAccNo()
	{
		
		Document doc=UserDatabase.getLastDocument();
		
	double accNo =doc.getDouble("accountNo");
		return accNo;
	}
	
	public static void addUser(UserDetails user)
	{
		   Document doc = Adapter.toDocumentObject(user);
		   UserDatabase.addDocument(doc);
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
