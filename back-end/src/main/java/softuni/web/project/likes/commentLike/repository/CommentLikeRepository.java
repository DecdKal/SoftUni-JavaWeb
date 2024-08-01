package softuni.web.project.likes.commentLike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.web.project.likes.commentLike.CommentLikeEntity;

@Repository
public interface CommentLikeRepository extends JpaRepository<CommentLikeEntity, Long> {
}
