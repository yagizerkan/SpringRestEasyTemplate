package ie.decaresystems.rest;

import ie.decaresystems.domain.Message;
import ie.decaresystems.message.Messenger;
import ie.decaresystems.message.SimpleMessenger;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Yagiz Erkan
 * @since 10/02/2014
 */
@Path("/communicator")
public class Communicator implements Communication {
  @Override
  public Response saySomething(String aType) {
    Messenger messenger = new SimpleMessenger();
    Message message = messenger.saySomething(aType);
    return Response.ok(message).build();
  }
}
