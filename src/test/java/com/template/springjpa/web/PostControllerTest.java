package com.template.springjpa.web;

import com.template.springjpa.domain.posts.Posts;
import com.template.springjpa.domain.posts.PostsRepository;
import com.template.springjpa.web.dto.PostSaveDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostControllerTest {

    @Autowired
    PostsRepository repository;

    @After
    public void cleanUp(){
        repository.deleteAll();
    }

    @Test
    public void Post_등록테스트(){

        //given
        boolean useYn = true;
        int code = 100;
        String title = "test title";
        String content = "test content";
        String attachedFileName = "test file name";
        String attachedFileUrl = "test file url";


        repository.save(Posts.builder()
                    .appendUser(1)
                    .useYn(useYn)
                    .code(code)
                    .title(title)
                    .content(content)
                    .attachedFileUrl(attachedFileUrl)
                    .attachedFileName(attachedFileName)
                    .build());

        //when
        List<Posts> postList = repository.findAll();


        //then
        Posts result = postList.get(0);
        assertThat(result.getTitle()).isEqualTo(title);
        assertThat(result.getContent()).isEqualTo(content);

    }

    @Test
    public void Post_수정테스트(){
        //given
        Posts saveEntity = repository.save(Posts.builder()
                .useYn(true)
                .code(1)
                .title("test title")
                .content("test content")
                .build());

        Long postId = saveEntity.getId();
        String updateTitle = "update title";
        String updateContent = "update content";

        PostSaveDto dto = PostSaveDto.builder()
                .title(updateTitle)
                .content(updateContent)
                .build();
    }


}
