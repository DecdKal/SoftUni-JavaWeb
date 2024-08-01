package softuni.web.project.likes.commentLike.dto;

import softuni.web.project.comment.CommentEntity;
import softuni.web.project.user.UserEntity;

public record CommentLikeDTO(
        UserEntity user,
        CommentEntity comment) {
}
