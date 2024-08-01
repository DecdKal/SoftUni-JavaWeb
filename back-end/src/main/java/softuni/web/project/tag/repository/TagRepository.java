package softuni.web.project.tag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.web.project.tag.TagEntity;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, Long> {
}
