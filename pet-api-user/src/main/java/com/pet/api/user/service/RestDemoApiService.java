package com.pet.api.user.service;

import com.pet.api.user.request.QUERY_USER_REQ;
import com.pet.api.user.response.QUERY_USER_RES;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("reset_demon")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface RestDemoApiService {

    @POST
    @Path("testList")
    QUERY_USER_RES testList(@BeanParam final QUERY_USER_REQ req);

    @POST
    @Path("testInfo")
    QUERY_USER_RES testInfo(@BeanParam final QUERY_USER_REQ req);

    @GET
    @Path("testString")
    QUERY_USER_RES testString(@BeanParam final QUERY_USER_REQ req);
}
