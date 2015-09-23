package com.tierconnect.xively;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Created by Paul Landaeta on 9/23/2015.
 */
@Path("/Dashboard")
@Api(value = "/Dashboard",description = "Dashboard methods")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Dashboard {
    @GET
    @Path("/updateDashboard")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(position=2, value="Execute Report Definition")
    public Response updateDashboard()   {
        return Response.status(200).build();
    }
}
