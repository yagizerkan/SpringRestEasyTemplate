package ie.decaresystems.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Yagiz Erkan
 */
public interface Communication {

  @GET
  @Path("/messages/{type}")
  @Produces(MediaType.APPLICATION_JSON)
  Response saySomething(@PathParam("type") String aType);

}
