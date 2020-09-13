package com.casestudy.onlinebanking;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.casestudy.userdetail.UserDetails;
import com.casestudy.userdetail.UserServices;

import admin.AddAmount;
import admin.AdminServices;

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
	
}
