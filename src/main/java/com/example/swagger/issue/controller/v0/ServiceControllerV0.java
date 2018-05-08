package com.example.swagger.issue.controller.v0;

import com.example.swagger.issue.config.PathConstants;
import com.example.swagger.issue.dto.Data;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Produces({MediaType.APPLICATION_JSON})
@Path(PathConstants.SERVICE_PATH)
public class ServiceControllerV0 {

    @POST
    @Path(PathConstants.FIND_PATH)
    @Consumes({MediaType.APPLICATION_JSON})
    @Operation(description = "Returns smt for input param")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success find"),
            @ApiResponse(responseCode = "500", description = "Some server problems while finding")})
    public Response find(final Data data) {
        //do something...
        return Response.ok(data.getParam1().toUpperCase()).build();
    }

    @POST
    @Path(PathConstants.CREATE_PATH)
    @Consumes({MediaType.APPLICATION_JSON})
    @Operation(description = "Creates smt for input params")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success create"),
            @ApiResponse(responseCode = "500", description = "Some server problems while creating")})
    public Response create(final Data data) {
        //do something...
        return Response.ok(String.join("_", data.getParam1(), data.getParam2())).build();
    }

    @GET
    @Path(PathConstants.FOO_PATH)
    @Consumes({MediaType.APPLICATION_JSON})
    @Operation(description = "Do smt and returns number")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success foo"),
            @ApiResponse(responseCode = "500", description = "Some server problems while foo executing")})
    public Response foo() {
        //do something...
        return Response.ok(42).build();
    }
}
