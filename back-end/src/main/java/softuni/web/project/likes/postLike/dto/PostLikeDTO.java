package softuni.web.project.likes.postLike.dto;

import softuni.web.project.post.PostEntity;
import softuni.web.project.user.UserEntity;

public record PostLikeDTO(
        UserEntity user,
        PostEntity post) {
}
