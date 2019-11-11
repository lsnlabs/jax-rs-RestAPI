package com.lsnlabs.jax.rs.rest.api.v1;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/*
*  Defines the "customers" collection and its resources
*
* */

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResources {

    @GET
    public Response hello(){
        return Response.ok("Hello").build();
    }


}
