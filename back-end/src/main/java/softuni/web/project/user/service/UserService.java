package softuni.web.project.user.service;

import org.springframework.stereotype.Service;
import softuni.web.project.user.PUserDetails;
import softuni.web.project.user.UserEntity;
import softuni.web.project.user.dto.UserRegistrationDTO;

import java.util.Optional;

public interface UserService {

    UserEntity registerUser(UserRegistrationDTO userRegistrationDTO);

    Optional<PUserDetails> getCurrentUser();
}
