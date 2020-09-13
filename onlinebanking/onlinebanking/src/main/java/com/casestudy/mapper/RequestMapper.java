package com.casestudy.mapper;

import org.bson.Document;

import com.dxc.mobilerequest.MobileRequest;


public class RequestMapper {

	
	public static Document toDocumentObject(MobileRequest mobrequest)
	{
		Document doc = new Document();
		
		
	
		doc.append("accountNo",mobrequest.getAccountNo());
		doc.append("oldMobileNo",mobrequest.getOldMobileNo());
		doc.append("newMobileNo",mobrequest.getNewMobileNo());

		return doc;
	}
	 
	
	
	
	
	
}
