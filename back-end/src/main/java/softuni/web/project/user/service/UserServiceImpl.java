package softuni.web.project.user.service;

import org.springframework.stereotype.Service;
import softuni.web.project.user.UserEntity;
import softuni.web.project.user.dto.UserRegistrationDTO;
import softuni.web.project.user.repository.UserRepository;
import softuni.web.project.user.roles.UserRoleEntity;
import softuni.web.project.user.roles.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public UserEntity registerUser(UserRegistrationDTO userRegistrationDTO) {

        if (userRepository.existsByUsername(userRegistrationDTO.username())) {
            throw new RuntimeException("Username is already taken!");
        }
        if (userRepository.existsByEmail(userRegistrationDTO.email())) {
            throw new RuntimeException("Email is already registered!");
        }

        return userRepository.save(map(userRegistrationDTO));
    }

    private UserEntity map(UserRegistrationDTO userRegistrationDTO) {
        UserRoleEntity role =  roleRepository.findByName("USER");
        List<UserRoleEntity> roles = new ArrayList<>();
        roles.add(role);

        return new UserEntity()
                .setUsername(userRegistrationDTO.username())
                .setEmail(userRegistrationDTO.email())
                .setPassword(userRegistrationDTO.password())
                .setComments(new ArrayList<>())
                .setRoles(roles);
    }
}
