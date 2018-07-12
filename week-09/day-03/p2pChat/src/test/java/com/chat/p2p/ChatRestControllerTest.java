package com.chat.p2p;

import com.chat.p2p.contollers.ChatRestController;
import com.chat.p2p.services.MessageService;
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
@WebMvcTest(ChatRestController.class)
public class ChatRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
    MediaType.APPLICATION_JSON.getSubtype(),
    Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void receiveMessage_gotParams() throws Exception {
    mockMvc.perform(post("/api/message/receive")
      .contentType(MediaType.APPLICATION_JSON)
      .content("{" +
        "  \"client\": {" +
        "    \"id\": \"EggDice\"" +
        "  }" +
        "}"))

      .andExpect(status().isOk())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.status", is("ok")));
  }

  @Test
  public void receiveMessage_missingParams() throws Exception {
    mockMvc.perform(post("/api/message/receive")
      .contentType(MediaType.APPLICATION_JSON))

      .andExpect(status().isBadRequest())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.status", is("error")))
      .andExpect(jsonPath("$.message", is("Missing parameters")));
  }
}
