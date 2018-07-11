package com.chat.p2p.models.dataTransferObjects;

import com.chat.p2p.models.Client;
import com.chat.p2p.models.Message;

public class DTO {

  private Message message;
  private Client client;

  public DTO() {
  }

  public DTO(Message message, Client client) {
    this.message = message;
    this.client = client;
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
