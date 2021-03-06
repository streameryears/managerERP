package com.wangsocial.app.controller;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletResponse;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

/**
 * Created by Lenovo on 2017/6/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() {
        RestAssuredMockMvc.webAppContextSetup(context);
    }

    @Test
    public void addUser() throws Exception {
        given().
                log().all().
                when().
                get("/user/add").
                then().
                log().all().
                statusCode(HttpServletResponse.SC_OK).
                contentType("application/json");
    }
}