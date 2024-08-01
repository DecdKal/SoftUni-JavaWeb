package softuni.web.project.user.roles;

import jakarta.persistence.*;

@Table(name = "roles")
@Entity
public class UserRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserRoleEnum name;

    public Long getId() {
        return id;
    }

    public UserRoleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public UserRoleEnum getRole() {
        return name;
    }

    public UserRoleEntity setRole(UserRoleEnum role) {
        this.name = role;
        return this;
    }
}
