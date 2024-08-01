package softuni.web.project.post.service;

import softuni.web.project.post.PostEntity;
import softuni.web.project.post.dto.PostDTO;
import softuni.web.project.post.repository.PostRepository;

import java.time.LocalDateTime;

public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void addPost(PostDTO postDTO) {

        postRepository.save(map(postDTO));
    }

    private PostEntity map(PostDTO postDTO) {
        return new PostEntity()
                .setAuthor(postDTO.author())
                .setContent(postDTO.content())
                .setTitle(postDTO.title())
                .setTags(postDTO.tags())
                .setCreatedOn(LocalDateTime.now())
                .setLastUpdatedOn(LocalDateTime.now());
    }
}
