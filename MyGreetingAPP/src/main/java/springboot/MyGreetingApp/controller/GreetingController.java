package springboot.MyGreetingApp.controller;


import org.springframework.web.bind.annotation.*;
import springboot.MyGreetingApp.DTO.Message;


@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping
    public Message greeting()
    {
        return new Message("Hello from BridgeLabz !");
    }

    @PostMapping
    public Message postGreeting()
    {
        return new Message("This is POST Method");
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
