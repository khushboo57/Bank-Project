package com.casestudy.dbconnection;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DatabaseConnection {


	private static final String DBNAME = "bankingDetails";
	private static final String USER_COLLECTION = "userDetails";
	private static final String ADMIN_COLLECTION = "adminDetails";
	private static final String MOBILE_DETAILS_COLLECTION = "mobileRequestDetails";
	
	private  static MongoCollection<Document> userCollection;
	private  static MongoCollection<Document> adminCollection;
	private  static MongoCollection<Document> mobileRequestCollection;
	

	static {
		
		MongoClient mongo=new MongoClient("localhost",27017);
		MongoDatabase database=mongo.getDatabase(DBNAME);
		userCollection=database.getCollection(USER_COLLECTION);
		adminCollection=database.getCollection(ADMIN_COLLECTION);
		mobileRequestCollection=database.getCollection(MOBILE_DETAILS_COLLECTION);
		
		
	}
	
	
	public static MongoCollection<Document> getUserCollection() {
		return userCollection;
	}




	public static MongoCollection<Document> getAdminCollection() {
		return adminCollection;
	}




	public static MongoCollection<Document> getMobileRequestCollection() {
		return mobileRequestCollection;
	}





	
	
	
	
	
	
	
	
//	//adding user
//	public static void addUser(Document user) {
//		userCollection.insertOne(user);
//	}
//	
//	public static String countdocument()
//	{
//		long c=userCollection.countDocuments();
//	   System.out.println("no of documents are "+ c);
//	   String s = Long.toString(c);
//	   return s;
//	}
	
	
}
