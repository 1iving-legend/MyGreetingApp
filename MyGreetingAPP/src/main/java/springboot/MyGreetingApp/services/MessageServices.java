package springboot.MyGreetingApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.MyGreetingApp.DTO.Message;
import springboot.MyGreetingApp.repository.GreetingRepo;

import java.util.Optional;

@Service
public class MessageServices {

    @Autowired
    GreetingRepo repo;

    public String getGreeting()
    {
        return repo.findAll().toString();
    }

    public void postGreeting(String firstName, String lastName)
    {
        String value= "Hello "+ firstName+" "+lastName;
        repo.save(new Message(value));
    }

    public Message getGreetingByID(int id) {
       return repo.findById(id).orElse(null);
    }

}
