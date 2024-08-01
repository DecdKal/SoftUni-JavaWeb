package softuni.web.project.comment.service;

import org.springframework.stereotype.Service;
import softuni.web.project.comment.dto.CommentDTO;

public interface CommentService {
    void addComment(CommentDTO commentDTO);
}
