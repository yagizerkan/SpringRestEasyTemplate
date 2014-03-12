package ie.decaresystems.message;

import ie.decaresystems.domain.Message;

/**
 * @author Yagiz Erkan
 */
public class SimpleMessenger implements Messenger {

  @Override
  public Message saySomething(String aType) {
    if ("hello".equalsIgnoreCase(aType)) {
      return new Message("Hello, World!");
    } else {
      return new Message("What's up?");
    }
  }
}
