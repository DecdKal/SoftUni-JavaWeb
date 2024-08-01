package softuni.web.project.post.service;

import org.springframework.stereotype.Service;
import softuni.web.project.post.dto.PostDTO;

@Service
public interface PostService {

    void addPost(PostDTO postDTO);
}
