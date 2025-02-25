package springboot.MyGreetingApp.DTO;

import jakarta.persistence.*;

@Entity
@Table(name = "greetings")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;

    Message(){}

    public int getId() {
        return id;
    }

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
