package ie.decaresystems.message;

import ie.decaresystems.domain.Message;

/**
 * @author Yagiz Erkan
 */
public interface Messenger {
  Message saySomething(String aType);
}
