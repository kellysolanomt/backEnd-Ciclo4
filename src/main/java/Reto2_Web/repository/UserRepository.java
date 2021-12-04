package Reto2_Web.repository;

import Reto2_Web.interfaces.InterfaceUser;
import Reto2_Web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    @Autowired
    private InterfaceUser userCrudRepository;

    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }
    public Optional<User> getUser(int id){
        return userCrudRepository.findById(id);
    }

    public User create(User user){
        return userCrudRepository.save(user);
    }

    public void update(User user){
        userCrudRepository.save(user);
    }

    public void delete(User user){
        userCrudRepository.delete(user);
    }

    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }

    public Optional<User> authenticateUser(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email,password);
    }
}
