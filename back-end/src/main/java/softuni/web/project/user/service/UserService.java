package softuni.web.project.user.service;

import org.springframework.stereotype.Service;
import softuni.web.project.user.UserEntity;
import softuni.web.project.user.dto.UserRegistrationDTO;

public interface UserService {

    UserEntity registerUser(UserRegistrationDTO userRegistrationDTO);
}
