package admin;

import org.bson.Document;

import com.casestudy.dbconnection.DatabaseConnection;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

public class AdminDatabase {

	static MongoCollection<Document> UsrCollection;
	static MongoCollection<Document> AdminCollection;
	
	static {
		UsrCollection=DatabaseConnection.getUserCollection();
		AdminCollection=DatabaseConnection.getAdminCollection();
	}
	
	     public static  updateBalance(int accountNo,double amountToAdd)
	     {
	    Document doc= UsrCollection.find().filter(Filters.eq("accountNo",accountNo)).first();
	    double balance = doc.getDouble("balance")
	     }
	
}
