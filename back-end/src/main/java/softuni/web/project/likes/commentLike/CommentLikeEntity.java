package softuni.web.project.likes.commentLike;

import jakarta.persistence.*;
import softuni.web.project.comment.CommentEntity;
import softuni.web.project.user.UserEntity;

@Entity
@Table(name = "comment_likes")
public class CommentLikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private CommentEntity comment;

    public Long getId() {
        return id;
    }

    public CommentLikeEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public CommentLikeEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public CommentEntity getComment() {
        return comment;
    }

    public CommentLikeEntity setComment(CommentEntity comment) {
        this.comment = comment;
        return this;
    }
}
