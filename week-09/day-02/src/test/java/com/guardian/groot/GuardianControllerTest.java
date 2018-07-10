package com.guardian.groot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
    MediaType.APPLICATION_JSON.getSubtype(),
    Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void getGroot_gotMessage() throws Exception {
    mockMvc.perform(get("/groot")
      .param("message", "somemessage")
      .contentType(MediaType.APPLICATION_JSON))

      .andExpect(status().isOk())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.received", is("somemessage")))
      .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void getGroot_missingMessage() throws Exception {
    mockMvc.perform(get("/groot")
      .contentType(MediaType.APPLICATION_JSON))

      .andExpect(status().isBadRequest())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void getYoundu_gotParams() throws Exception {
    mockMvc.perform(get("/yondu")
      .param("distance", String.valueOf(100.0))
      .param("time", String.valueOf(20.0))
      .contentType(MediaType.APPLICATION_JSON))

      .andExpect(status().isOk())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.distance", is(100.0)))
      .andExpect(jsonPath("$.time", is(20.0)))
      .andExpect(jsonPath("$.speed", is(5.0)));
  }

  @Test
  public void getYondu_missingParams() throws Exception {
    mockMvc.perform(get("/yondu")
      .contentType(MediaType.APPLICATION_JSON))

      .andExpect(status().isBadRequest())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.error", is("Missing parameters")));
  }
}
