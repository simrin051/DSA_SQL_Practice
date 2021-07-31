package com.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class TestCount {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void test() {
		try
		{
		RequestBuilder request=MockMvcRequestBuilders.post("/storeurl?url=google.com");
		MvcResult result=mockMvc.perform(request).andReturn();
		request=MockMvcRequestBuilders.get("/get?url=google.com").accept(MediaType.APPLICATION_JSON);
		result=mockMvc.perform(request).andReturn();		
		request=MockMvcRequestBuilders.get("/count?url=google.com").accept(MediaType.APPLICATION_JSON);
		result=mockMvc.perform(request).andReturn();
		System.out.println("Result"+result.getResponse().getContentAsString());
		assertEquals(1,result.getResponse().getContentLength());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
