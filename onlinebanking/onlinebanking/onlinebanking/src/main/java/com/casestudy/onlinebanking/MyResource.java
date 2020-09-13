package com.casestudy.onlinebanking;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.casestudy.dbconnection.DatabaseConnection;
import com.casestudy.userdetail.UserDetails;
import com.casestudy.userdetail.UserServices;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("user")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
     
    @POST
    @Path("adduser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public  Response adduser(UserDetails usr)
    {
    	UserServices.addUser(usr);
    	return Response.ok("{\"status\":\"0\",\"message\":\"successfuly added\"}")
    			.build();
    }
    
//    
//    @GET
//    @Path("count")
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getdocumentno() {
//        return DatabaseConnection.countdocument();
//       }
}
