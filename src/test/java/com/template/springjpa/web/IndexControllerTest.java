package com.template.springjpa.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class) // SpringRunner.class를 사용하여 해당 테스트 실행
@WebMvcTest(controllers = IndexController.class) // MVC test 코드 작성에 사용 (@Controller, @ControllerAdvice 사용 가능)
public class IndexControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void index_test() throws Exception{
        String hello = "hello jpa";


        mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(hello));
    }


}
