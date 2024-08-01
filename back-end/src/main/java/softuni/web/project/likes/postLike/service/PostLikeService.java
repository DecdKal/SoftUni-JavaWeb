package softuni.web.project.likes.postLike.service;

import org.springframework.stereotype.Service;
import softuni.web.project.likes.postLike.dto.PostLikeDTO;

@Service
public interface PostLikeService {
    void addPostLike(PostLikeDTO postLikeDTO);
}
