package com.template.springjpa.web.post;

import com.template.springjpa.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {

    private PostsService service;

}
