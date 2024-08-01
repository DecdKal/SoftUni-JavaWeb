package softuni.web.project.likes.postLike.service;
import softuni.web.project.likes.postLike.PostLikeEntity;
import softuni.web.project.likes.postLike.dto.PostLikeDTO;
import softuni.web.project.likes.postLike.repository.PostLikeRepository;

public class PostLikeServiceImpl implements PostLikeService {

    private final PostLikeRepository postLikeRepository;

    public PostLikeServiceImpl(PostLikeRepository postLikeRepository) {
        this.postLikeRepository = postLikeRepository;
    }

    @Override
    public void addPostLike(PostLikeDTO postLikeDTO) {
        postLikeRepository.save(map(postLikeDTO));
    }

    private PostLikeEntity map(PostLikeDTO postLikeDTO) {

        return new PostLikeEntity()
                .setPost(postLikeDTO.post())
                .setUser(postLikeDTO.user());
    }
}
