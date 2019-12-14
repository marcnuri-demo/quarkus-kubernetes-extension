/*
 * Main.java
 *
 * Created on 2019-12-11, 15:03
 */
package com.marcnuri.demo.quarkuskubernetesextension;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Marc Nuri <marc@marcnuri.com> on 2019-12-11.
 */
@Path("/")
public class Main {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello";
    }
}
