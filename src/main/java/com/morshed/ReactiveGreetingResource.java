package com.morshed;

import com.morshed.dto.HelloDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ReactiveGreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloDTO hello() {
        return new HelloDTO("Hello RESTEasy Reactive JSON");
    }
}