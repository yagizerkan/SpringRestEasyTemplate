package ie.decaresystems.rest;

import ie.decaresystems.domain.Message;
import ie.decaresystems.message.Messenger;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Yagiz Erkan
 */
@Path("/communicator")
@Service
public class Communicator implements Communication {

  @Resource(name = "messenger")
  private Messenger messenger;

  @Override
  public Response saySomething(String aType) {
    Message message = messenger.saySomething(aType);
    return Response.ok(message).build();
  }

  public void setMessenger(Messenger messenger) {
    this.messenger = messenger;
  }
}
