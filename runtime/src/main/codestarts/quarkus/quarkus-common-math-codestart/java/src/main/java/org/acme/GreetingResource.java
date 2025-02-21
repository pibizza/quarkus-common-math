package org.acme;

import org.apache.commons.math3.random.RandomDataGenerator;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	
    	RandomDataGenerator generator = new RandomDataGenerator();
        return "Hello from Quarkus REST " + generator.nextPoisson(5.0);
    }
}
