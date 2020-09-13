package admin;

import java.util.ArrayList;
import java.util.Iterator;

import org.bson.Document;

import com.casestudy.dbconnection.DatabaseConnection;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class AdminDatabase {
	static MongoCollection<Document> UsrCollection;
	static MongoCollection<Document> AdminCollection;
	static MongoCollection<Document> MobRequestCollection;
	static {
		UsrCollection=DatabaseConnection.getUserCollection();
		AdminCollection=DatabaseConnection.getAdminCollection();
		MobRequestCollection=DatabaseConnection.getMobileRequestCollection();
	}
	
	     public static void updateBalance(int accountNo,double amountToAdd)
	     {
	        Document doc= UsrCollection.find().filter(Filters.eq("accountNo",accountNo)).first();
	     
	        double balance = doc.getDouble("balance");
	     
	        System.out.println("hgd");
	 
	        double  updatedBalance = balance+amountToAdd;
	 
	        
	        UsrCollection.updateOne(Filters.eq("accountNo", accountNo), Updates.set("balance", updatedBalance)); 
	        
	        System.out.println("later");
	     }
	
	     public static void updateBalance(int creditAccNo,int debitAccNo,double amountToAdd)
	     {
	    	 Document doc1= UsrCollection.find().filter(Filters.eq("accountNo",debitAccNo)).first();
	    	 
	    	 
	    	 double debitAccBal=doc1.getDouble("balance");
	    	 
	    	 System.out.println(debitAccBal);   //addded for checking
	    	
	    	 
	    	 Document doc2 = UsrCollection.find().filter(Filters.eq("accountNo",creditAccNo)).first();
	    	 
	    
	    	 double creditAccBal=doc2.getDouble("balance");
	    	 
	    	 double debitUpdatedBal = debitAccBal- amountToAdd;
	    	 double creditUpdatedBal= creditAccBal + amountToAdd;
	    	 
	    	 UsrCollection.updateOne(Filters.eq("accountNo", debitAccNo), Updates.set("balance", debitUpdatedBal)); 
	    	 UsrCollection.updateOne(Filters.eq("accountNo", creditAccNo), Updates.set("balance", creditUpdatedBal)); 
	     }
	     
	     
	     public static double returnBalance(int accountNo)
	     {
	    	 Document doc = UsrCollection.find().filter(Filters.eq("accountNo",accountNo)).first();
	    	 double balance = doc.getDouble("balance");
	    	 return balance;
	     }
	     
	    public static ArrayList returnMobileRequest()
	    {
	    	ArrayList allMobReq = new ArrayList();
			FindIterable<Document> fit = MobRequestCollection.find();
			Iterator<Document> it = fit.iterator();
			while (it.hasNext()) {
				Document mobReqDoc = (Document) it.next();
				allMobReq.add(mobReqDoc);
			}
			return allMobReq;
	    	
	    }
	     
	     
}
