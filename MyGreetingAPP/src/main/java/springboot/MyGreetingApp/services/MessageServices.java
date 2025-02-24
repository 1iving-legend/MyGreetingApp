package springboot.MyGreetingApp.services;

import org.springframework.stereotype.Service;

@Service
public class MessageServices {

    public String getGreeting()
    {
        return "Hello  from vivek";
    }

}
