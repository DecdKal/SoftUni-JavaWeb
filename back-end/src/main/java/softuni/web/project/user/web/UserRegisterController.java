package softuni.web.project.user.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import softuni.web.project.user.UserEntity;
import softuni.web.project.user.dto.UserRegistrationDTO;
import softuni.web.project.user.service.UserService;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/register")
public class UserRegisterController {

    private final UserService userService;

    public UserRegisterController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String register(UserRegistrationDTO userRegistrationDTO) {
        userService.registerUser(userRegistrationDTO);
        return "User registered";
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationDTO user) {
        try {
            UserEntity registeredUser = userService.registerUser(user);
            return ResponseEntity.ok(registeredUser);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
