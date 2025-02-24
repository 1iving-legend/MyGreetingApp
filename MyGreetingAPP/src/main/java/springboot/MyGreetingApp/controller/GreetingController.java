package springboot.MyGreetingApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import springboot.MyGreetingApp.DTO.Message;
import springboot.MyGreetingApp.DTO.User;
import springboot.MyGreetingApp.services.MessageServices;


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

    @PostMapping
    public Message postGreeting(@RequestBody User user)
    {
        return new Message("Hello " + user.getFirstName()+" "+ user.getLastName());
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
