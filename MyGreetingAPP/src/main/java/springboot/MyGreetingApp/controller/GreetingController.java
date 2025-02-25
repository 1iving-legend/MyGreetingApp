package springboot.MyGreetingApp.controller;


import org.hibernate.boot.model.internal.XMLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import springboot.MyGreetingApp.DTO.Message;
import springboot.MyGreetingApp.DTO.User;
import springboot.MyGreetingApp.repository.GreetingRepo;
import springboot.MyGreetingApp.services.MessageServices;

import java.util.List;


@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    MessageServices service1;

    GreetingController(MessageServices service1)
    {
        this.service1=service1;
    }


    @GetMapping
    public Message greeting()
    {
        return new Message(service1.getGreeting());
    }

    @GetMapping("id/{id}")
    public String display(@PathVariable int id) {
        Message message = service1.getGreetingByID(id);

        // Handle null case
        return (message != null) ? message.getContent() : "Greeting not found!";
    }

    @GetMapping("id/all")
    public List<Message> displayAll() {
        List<Message> message = service1.getGreetings();

        return message;
    }

    @PostMapping
    public void postGreeting(@RequestBody User user)
    {
       service1.postGreeting(user.getFirstName(),user.getLastName());
    }

    @PutMapping
    public Message putGreeting()
    {
        return new Message("This is PUT Method");
    }

    @DeleteMapping
    public Message deleteGreeting()
    {
        return new Message("This is Delete Method");
    }

}
