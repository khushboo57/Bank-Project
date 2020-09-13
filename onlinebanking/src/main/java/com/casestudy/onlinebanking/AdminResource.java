package com.casestudy.onlinebanking;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.bson.Document;

import com.casestudy.userdetail.UserDetails;
import com.casestudy.userdetail.UserServices;

import admin.AddAmount;
import admin.AdminServices;
import admin.TransferAmount;

@Path("admin")
public class AdminResource {

	  @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getIt() {
	        return "admin Got it!";
	    }
	
	  @POST
	    @Path("addamount")
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.APPLICATION_JSON)
	    public  Response adduser(AddAmount addamount)
	    {
	    	AdminServices.addAmount(addamount);
	    	return Response.ok("{\"status\":\"0\",\"message\":\"successfuly added\"}")
	    			.build();
	    }
	
	  @POST
	  @Path("transferamount")
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response transfer(TransferAmount transferamount)
	  {
		  
		  AdminServices.transferAmount(transferamount);
			return Response.ok("{\"status\":\"0\",\"message\":\"successfuly added\"}")
	    			.build();
	  }
	  

	  @GET
	  @Path("showbalance/{accountNo}")
	    @Produces(MediaType.TEXT_PLAIN)
	  public Response showBalance(@PathParam("accountNo") int accountNo)
	  {
		  
		  
			return Response.ok(AdminServices.getBalance(accountNo))
	    			.build();
	  }
	  
	  @GET
	  @Path("showmobilerequest")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response showMobileRequest()
	  {
		  return Response.ok(AdminServices.getMobileRequest()).build();
	  }



}
