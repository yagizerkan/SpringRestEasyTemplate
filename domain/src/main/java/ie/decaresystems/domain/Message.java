package ie.decaresystems.domain;

/**
 * @author Yagiz Erkan
 */
public class Message {

  private String content;

  public Message(String aContent) {
    this.content = aContent;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return content;
  }
}
