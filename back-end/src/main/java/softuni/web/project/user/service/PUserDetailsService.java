package softuni.web.project.user.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import softuni.web.project.user.PUserDetails;
import softuni.web.project.user.UserEntity;
import softuni.web.project.user.repository.UserRepository;
import softuni.web.project.user.roles.UserRoleEntity;
import softuni.web.project.user.roles.UserRoleEnum;

public class PUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public PUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return userRepository
                .findByEmail(email)
                .map(PUserDetailsService::map)
                .orElseThrow(
                        () -> new UsernameNotFoundException("User with email " + email + " not found!"));
    }

    private static UserDetails map(UserEntity userEntity) {

        return new PUserDetails(
                userEntity.getUuid(),
                userEntity.getEmail(),
                userEntity.getPassword(),
                userEntity.getRoles().stream().map(UserRoleEntity::getRole).map(PUserDetailsService::map).toList()
        );
    }

    private static GrantedAuthority map(UserRoleEnum role) {
        return new SimpleGrantedAuthority(
                "ROLE_" + role);
    }

}
