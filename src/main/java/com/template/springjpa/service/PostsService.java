package com.template.springjpa.service;

import com.template.springjpa.domain.posts.PostsRepository;
import com.template.springjpa.web.dto.PostSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository repository;

    public Long save(PostSaveDto dto) {

        return repository.save(dto.toEntity()).getId();
    }
}
