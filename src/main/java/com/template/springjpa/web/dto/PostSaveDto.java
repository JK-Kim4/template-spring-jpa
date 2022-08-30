package com.template.springjpa.web.dto;

import com.template.springjpa.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostSaveDto {

    private boolean useYn;
    private int code;
    private String title;
    private String content;
    private String attachedFileName;
    private String attachedFileUrl;

    @Builder
    public PostSaveDto(boolean useYn, int code, String title,
                       String content, String attachedFileName, String attachedFileUrl){
        this.useYn = useYn;
        this.code = code;
        this.title = title;
        this.content = content;
        this.attachedFileName = attachedFileName;
        this.attachedFileUrl = attachedFileUrl;
    }

    public Posts toEntity(){
        return new Posts().builder()
                .useYn(useYn)
                .code(code)
                .title(title)
                .content(content)
                .attachedFileName(attachedFileName)
                .attachedFileUrl(attachedFileUrl)
                .appendUser(1)
                .build();
    }


}
