package softuni.web.project.comment.service;

import org.springframework.stereotype.Service;
import softuni.web.project.comment.CommentEntity;
import softuni.web.project.comment.dto.CommentDTO;
import softuni.web.project.comment.repository.CommentRepository;

import java.time.LocalDateTime;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public void addComment(CommentDTO commentDTO) {
        commentRepository.save(map(commentDTO));
    }

    private CommentEntity map(CommentDTO commentDTO) {

        return new CommentEntity()
                .setAuthor(commentDTO.author())
                .setPost(commentDTO.post())
                .setContent(commentDTO.content())
                .setPostedOn(LocalDateTime.now());
    }
}
