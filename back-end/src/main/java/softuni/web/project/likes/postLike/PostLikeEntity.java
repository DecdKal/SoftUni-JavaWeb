package softuni.web.project.likes.postLike;

import jakarta.persistence.*;
import softuni.web.project.post.PostEntity;
import softuni.web.project.user.UserEntity;

@Entity
@Table(name = "post_likes")
public class PostLikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private PostEntity post;

    public Long getId() {
        return id;
    }

    public PostLikeEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public PostLikeEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public PostEntity getPost() {
        return post;
    }

    public PostLikeEntity setPost(PostEntity post) {
        this.post = post;
        return this;
    }


}
