package softuni.web.project.user.roles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.web.project.user.roles.UserRoleEntity;
import softuni.web.project.user.roles.UserRoleEnum;

@Repository
public interface RoleRepository extends JpaRepository<UserRoleEntity, Long> {

    UserRoleEntity findByName(UserRoleEnum userRoleEnum);

}
