package Reto2_Web.interfaces;

import Reto2_Web.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface InterfaceUser extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
