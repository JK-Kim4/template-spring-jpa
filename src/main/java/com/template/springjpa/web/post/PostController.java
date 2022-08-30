package com.template.springjpa.web.post;

import com.template.springjpa.service.PostsService;
import com.template.springjpa.web.dto.PostSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostsService service;

    @PostMapping("/post/save")
    public Long savePost(PostSaveDto dto){
        return service.save(dto);
    }

}
