package softuni.web.project.likes.commentLike.service;

import softuni.web.project.likes.commentLike.CommentLikeEntity;
import softuni.web.project.likes.commentLike.dto.CommentLikeDTO;
import softuni.web.project.likes.commentLike.repository.CommentLikeRepository;

public class CommentLikeServiceImpl implements CommentLikeService {

    private final CommentLikeRepository commentLikeRepository;

    public CommentLikeServiceImpl(CommentLikeRepository commentLikeRepository) {
        this.commentLikeRepository = commentLikeRepository;
    }

    @Override
    public void addCommentLike(CommentLikeDTO commentLikeDTO) {
        commentLikeRepository.save(map(commentLikeDTO));
    }

    private CommentLikeEntity map(CommentLikeDTO commentLikeDTO) {
        return new CommentLikeEntity()
                .setComment(commentLikeDTO.comment())
                .setUser(commentLikeDTO.user());
    }
}
