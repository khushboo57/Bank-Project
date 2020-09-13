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
 
 
 public static  Boolean updatePassword(int accountNo,String oldPass,String newPass)  //changes
	{
	 
      Document doc	= UsrCollection.find().filter(Filters.eq("accountNo",accountNo)).first();
	 String oldpassdoc=doc.getString("password");
	 
	 if(oldpassdoc.equals(oldPass))
	 {
		 UsrCollection.updateOne(Filters.eq("password",oldPass), Updates.set("password",newPass)); 
		return true; 
	 }
	 else
	 {
		 return false;
	 }

	 
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
 
 
 public static void updateBalance(int creditAccNo,int debitAccNo,double amountToAdd)
 {
	 Document doc1= UsrCollection.find().filter(Filters.eq("accountNo",debitAccNo)).first();
	 System.out.println("goittttt");
	 
	 double debitAccBal=doc1.getDouble("balance");
	 
	System.out.println(debitAccBal); //added for checking
	System.out.println("hwelllooo");
	 Document doc2 = UsrCollection.find().filter(Filters.eq("accountNo",creditAccNo)).first();
	 

	 double creditAccBal=doc2.getDouble("balance");
	 
	 double debitUpdatedBal = debitAccBal- amountToAdd;
	 double creditUpdatedBal= creditAccBal + amountToAdd;
	 
	 UsrCollection.updateOne(Filters.eq("accountNo", debitAccNo), Updates.set("balance", debitUpdatedBal)); 
	 UsrCollection.updateOne(Filters.eq("accountNo", creditAccNo), Updates.set("balance", creditUpdatedBal)); 
 }
 
 
 
 
 
 
}













//UpdateResult result	= UsrCollection.updateOne(Filters.eq("password",oldPass), Updates.set("password",newPass)); 
//// return result.wasAcknowledged();
// 
// if(result.getModifiedCount()==1)
//	 return true;
// else 
//	 return false;