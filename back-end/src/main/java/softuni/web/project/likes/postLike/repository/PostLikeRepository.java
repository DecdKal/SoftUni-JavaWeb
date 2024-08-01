package softuni.web.project.likes.postLike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.web.project.likes.postLike.PostLikeEntity;

@Repository
public interface PostLikeRepository extends JpaRepository<PostLikeEntity, Long> {
}
