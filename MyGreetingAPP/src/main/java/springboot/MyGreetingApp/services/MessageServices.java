package springboot.MyGreetingApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.MyGreetingApp.DTO.Message;
import springboot.MyGreetingApp.DTO.User;
import springboot.MyGreetingApp.repository.GreetingRepo;

import java.util.List;

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

    public List<Message> getGreetings() {
        return repo.findAll();
    }

    public String putGreeting(int id, Message updatedMessage) {
        // Check if the entity exists in the repository
        if (repo.existsById(id)) {
            // Fetch the existing message object from the repository
            Message existingMessage = repo.findById(id).orElseThrow(() -> new RuntimeException("Greeting not found"));

            // Update the content of the existing message (or any other fields)
            existingMessage.setContent(updatedMessage.getContent());

            // Save the updated entity
            repo.save(existingMessage);

            return "Greeting updated successfully!";
        } else {
            return "Greeting with ID " + id + " not found!";
        }
    }



}
