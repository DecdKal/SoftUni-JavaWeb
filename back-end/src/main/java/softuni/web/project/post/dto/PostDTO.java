package softuni.web.project.post.dto;

import softuni.web.project.tag.TagEntity;
import softuni.web.project.user.UserEntity;

import java.util.List;
import java.util.Optional;

public record PostDTO(
        String title,
        String content,
        UserEntity author,
        List<TagEntity> tags) {
}
