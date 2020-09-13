package com.casestudy.userdetail;

import org.bson.Document;

import com.casestudy.dbconnection.DatabaseConnection;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;



public class UserDatabase {

	static MongoCollection<Document> UsrCollection;
	static MongoCollection<Document> MobReqCollection;
	static {
		UsrCollection=DatabaseConnection.getUserCollection();
		MobReqCollection=DatabaseConnection.getMobileRequestCollection();
	}
	
 public static Document	getLastDocument()
	{
		
       return UsrCollection.find().sort(new BasicDBObject("accountNo", -1)).first();
	}
	
 public static void addDocument(Document doc)
 {
	 UsrCollection.insertOne(doc);
 }
 
 
 // return balance of particular account no
 public static double returnBalance(int accountNo)
 {
	 Document doc = UsrCollection.find().filter(Filters.eq("accountNo",accountNo)).first();
	 double balance = doc.getDouble("balance");
	 return balance;
 }
 
 
 public static  Boolean updatePassword(String oldPass,String newPass)
	{
	 
	
UpdateResult result	= UsrCollection.updateOne(Filters.eq("password",oldPass), Updates.set("password",newPass)); 
	// return result.wasAcknowledged();
	 
	 if(result.getModifiedCount()==1)
		 return true;
	 else 
		 return false;
	 
//	 
//    	Document password=new Document("password",oldPass);
//		Document set = new Document("$set", new Document("password", newPass));
//		UpdateResult result= UsrCollection.updateOne(password, set);
//		return result.wasAcknowledged();
		
	}
 
 public static void addmobilereq(Document doc)
 {
  MobReqCollection.insertOne(doc);
  
 }
 
 
 
 
 
 
 
}
