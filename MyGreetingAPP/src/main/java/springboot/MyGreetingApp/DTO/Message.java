package springboot.MyGreetingApp.DTO;

public class Message {
    private String content;

    Message(){}

    public Message(String content)
    {
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
