package org.wildfly.swarm.examples.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Bob McWhirter
 */
@Path("/")
public class MyResource {

    @GET
    @Produces("text/plain")
    public String get() {
        // Prove we can use an external dependency and weird JDK classes.
        return "Hello Wildfly Swarm world";
    }
}
