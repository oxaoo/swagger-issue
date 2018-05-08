package com.example.swagger.issue.controller.v1;

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
import java.util.Date;
import java.util.Random;

@RequestScoped
@Produces({MediaType.APPLICATION_JSON})
@Path(PathConstants.SERVICE_PATH)
public class ServiceControllerV1 {

    @POST
    @Path(PathConstants.FIND_PATH)
    @Consumes({MediaType.APPLICATION_JSON})
    @Operation(description = "Returns smt for input param [V1]")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success find"),
            @ApiResponse(responseCode = "500", description = "Some server problems while finding")})
    public Response find(final Data data) {
        //do something...
        return Response.ok(data.getParam2().toLowerCase()).build();
    }

    @POST
    @Path(PathConstants.CREATE_PATH)
    @Consumes({MediaType.APPLICATION_JSON})
    @Operation(description = "Creates smt for input params [V1]")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success create"),
            @ApiResponse(responseCode = "500", description = "Some server problems while creating")})
    public Response create(final Data data) {
        //do something...
        return Response.ok(String.join("|", data.getParam1(), data.getParam2())).build();
    }

    @GET
    @Path(PathConstants.BAR_PATH)
    @Consumes({MediaType.APPLICATION_JSON})
    @Operation(description = "Do smt and returns number")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success bar"),
            @ApiResponse(responseCode = "500", description = "Some server problems while bar executing")})
    public Response bar() {
        //do something...
        return Response.ok(new Random().nextInt()).build();
    }
}
