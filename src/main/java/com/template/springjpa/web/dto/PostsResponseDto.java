package com.template.springjpa.web.dto;

import com.template.springjpa.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private boolean useYn;
    private int code;
    private String title;
    private String content;
    private String attachedFileName;
    private String attachedFileUrl;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.useYn = entity.isUseYn();
        this.code = entity.getCode();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.attachedFileName = entity.getAttachedFileName();
        this.attachedFileUrl = entity.getAttachedFileUrl();
    }


}
