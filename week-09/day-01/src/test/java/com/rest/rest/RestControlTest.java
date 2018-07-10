package com.rest.rest;

import com.rest.rest.controllers.RestControl;
import com.rest.rest.services.RestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestControl.class)
public class RestControlTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
    MediaType.APPLICATION_JSON.getSubtype(),
    Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private RestService restService;


  @Test
  public void getDouble() throws Exception {
    mockMvc.perform(post("/doubling")
      .contentType(MediaType.APPLICATION_JSON)
      .content("{\"received\": 7}"))
      .andExpect(status().isOk())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.result", is("success")))
      .andExpect(jsonPath("$.message", is("Doubling is done")));
  }
}
