package springboot.MyGreetingApp.DTO;

import jakarta.persistence.*;

import java.util.Optional;

@Entity
@Table(name = "greetings")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;

    public int getId() {
        return id;
    }

    public Message() {
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
