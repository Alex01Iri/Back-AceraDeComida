package org.generation.demodb.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
@RestController
@RequestMapping(path="api/aceradecomida/")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class userController {
    private final UserService userService;
    @Autowired
    public userController(UserService userService) {
        this.userService = userService;
    }//constructor
    @GetMapping
    public List<user> getUsers() {
        return userService.getUsers();
    }//getUsers
    @GetMapping(path="{userId}")
    public user getUser(@PathVariable("userId") Long userId) {
        return userService.getUser(userId);
    }//getUser
    @DeleteMapping(path="{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
    }//deleteUser
    //@CrossOrigin("*")
    @PostMapping
    public void addUser(@RequestBody user usr){
        userService.addUser(usr);
    }// addUser
    @PutMapping(path="{userId}")
    public void updateUser (@PathVariable("userId") Long userId,
                            @RequestParam String oldPassword,
                            @RequestParam String password) {
        userService.updateUser(userId, oldPassword, password);
    }//updateUser
}//class userController