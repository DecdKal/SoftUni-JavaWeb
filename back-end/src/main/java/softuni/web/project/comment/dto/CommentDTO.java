package softuni.web.project.comment.dto;

import softuni.web.project.post.PostEntity;
import softuni.web.project.user.UserEntity;

public record CommentDTO(
        UserEntity author,
        PostEntity post,
        String content) {
}
