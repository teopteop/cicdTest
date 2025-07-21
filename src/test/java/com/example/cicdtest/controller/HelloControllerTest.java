package com.example.cicdtest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void hi_hi_문자열반환() throws Exception {
		mockMvc.perform(get("/hi"))
			.andExpect(status().isOk())
			.andExpect(content().string("hi"));
	}

	@Test
	void hello_hello_문자열반환() throws Exception {
		mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().string("hello"));
	}
}
