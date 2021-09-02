package org.generation.demodb.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }//constructor
    public List<user> getUsers(){
        return userRepository.findAll();
    }// getUsers
    public user getUser(Long sellerId){
        return userRepository.findById(sellerId).orElseThrow(
                () -> new IllegalStateException("User does not exists " + sellerId)
        );
    }// getUser
    public void deleteUser(Long sellerId) {
        if (userRepository.existsById(sellerId)) {
            userRepository.deleteById(sellerId);
        } else {
            throw new IllegalStateException("User does not exist " + sellerId);
        }//else
    } // deleteUser
    public void addUser(user usr){
        Optional<user> userByName = userRepository.findUserByName(usr.getUsername());
        if (userByName.isPresent()) {
            throw new IllegalStateException("username exist !!!");
        } //if
        userRepository.save(usr);
    }//addUser
    public void updateUser(Long sellerId, String oldPassword, String newPassword) {
        if (! userRepository.existsById(sellerId)) {
           throw new IllegalStateException("User does not exist " + sellerId);
        }//if ! exists
        user usr = userRepository.getById(sellerId);
        if (! usr.getPassword().equals(oldPassword)) {
            throw new IllegalStateException("Password does not match " + sellerId);
        }//if ! exists
       if (newPassword!=null && newPassword.length()>=4 &&
                (! usr.getPassword().equals(newPassword)) &&
                (usr.getPassword().equals(oldPassword)) ) {
                usr.setPassword(newPassword);
           userRepository.save(usr);
        }//if
    }// updateUser
}//class UserService