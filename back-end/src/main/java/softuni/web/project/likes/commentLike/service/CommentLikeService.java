package softuni.web.project.likes.commentLike.service;

import org.springframework.stereotype.Service;
import softuni.web.project.likes.commentLike.dto.CommentLikeDTO;

@Service
public interface CommentLikeService {
    void addCommentLike(CommentLikeDTO commentLikeDTO);
}
