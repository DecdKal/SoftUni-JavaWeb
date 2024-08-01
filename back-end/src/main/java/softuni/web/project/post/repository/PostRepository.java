package softuni.web.project.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.web.project.post.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {



}
