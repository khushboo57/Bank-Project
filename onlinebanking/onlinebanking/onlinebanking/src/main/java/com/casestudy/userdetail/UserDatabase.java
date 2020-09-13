package com.casestudy.userdetail;

import org.bson.Document;

import com.casestudy.dbconnection.DatabaseConnection;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;



public class UserDatabase {

	static MongoCollection<Document> UsrCollection;
	static {
		UsrCollection=DatabaseConnection.getUserCollection();
	}
	
 public static Document	getLastDocument()
	{
		
       return UsrCollection.find().sort(new BasicDBObject("accountNo", -1)).first();
	}
	
 public static void addDocument(Document doc)
 {
	 UsrCollection.insertOne(doc);
 }
}
