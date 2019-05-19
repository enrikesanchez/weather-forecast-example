package com.example.weather.ajax;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(ForecastAjaxController.class)
public class ForecastAjaxControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void shouldResturnJSONWhenCorrectUrlRequested() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/forecast/4014338/CELSIUS/1")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$[0].timestamp", isA(Integer.class)))
				.andExpect(jsonPath("$[1].timestamp", isA(Integer.class)))
				.andExpect(jsonPath("$[2].timestamp", isA(Integer.class)))
				.andExpect(jsonPath("$[3].timestamp", isA(Integer.class)))
				.andExpect(jsonPath("$[4].timestamp", isA(Integer.class)))
				.andExpect(jsonPath("$[5].timestamp", isA(Integer.class)))
				.andExpect(jsonPath("$[6].timestamp", isA(Integer.class)))
				.andExpect(jsonPath("$[7].timestamp", isA(Integer.class)));
	}

}
