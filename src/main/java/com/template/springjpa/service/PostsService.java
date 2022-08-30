package com.template.springjpa.service;

import com.template.springjpa.domain.posts.Posts;
import com.template.springjpa.domain.posts.PostsRepository;
import com.template.springjpa.web.dto.PostSaveDto;
import com.template.springjpa.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository repository;

    public Long save(PostSaveDto dto) {
        return repository.save(dto.toEntity()).getId();
    }

    public Long update(Long id, PostSaveDto dto){
        Posts post = repository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시글이 존재하지 않습니다. Id : " + id));
        post.update(dto);

        return post.getId();
    }

    public PostsResponseDto findPostById(Long id){
        Posts entity = repository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시글이 존재하지 않습니다. Id : " + id));
        return new PostsResponseDto(entity);
    }

}
