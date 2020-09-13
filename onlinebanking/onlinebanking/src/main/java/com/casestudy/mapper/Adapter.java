package com.casestudy.mapper;

import java.util.Iterator;

import org.bson.Document;

import com.casestudy.userdetail.UserDetails;
import com.casestudy.userdetail.UserServices;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.casestudy.dbconnection.*;
import com.casestudy.dbconnection.*;

public class Adapter {

	public static Document toDocumentObject(UserDetails usrDetail)
	{
		Document doc = new Document();
		
		
	//	doc.append("accountNo",1 + previous account no);
		// add auto increment account no here
		doc.append("accountNo",UserServices.getLastAccNo()+1);
		doc.append("name",usrDetail.getName());
		doc.append("mobile",usrDetail.getMobile());
		doc.append("email",usrDetail.getEmail());
		doc.append("aadharNo",usrDetail.getAadharNo());
		doc.append("address",usrDetail.getAddress());
		doc.append("password",usrDetail.getPassword());
		doc.append("balance",0.0);                //changing (double)0.0 to string "0"
// add amount field with value zero
		return doc;
	}
	 
	
}


// 	Document doc=pCollection.find().sort(new BasicDBObject("accountNo", -1)).first();
//   double acc= doc.getDouble("accountNo");