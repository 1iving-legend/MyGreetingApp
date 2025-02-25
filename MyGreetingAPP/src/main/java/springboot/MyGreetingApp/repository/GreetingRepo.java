package springboot.MyGreetingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.MyGreetingApp.DTO.Message;

@Repository
public interface GreetingRepo extends JpaRepository<Message,Integer> {

}
