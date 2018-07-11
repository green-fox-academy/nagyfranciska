package com.chat.p2p.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Entity
public class Message {

  Random rand = new Random();

  @Id
  private long id;
  private String username;
  private String text;
  private String timestamp;

  public Message() {
  }

  public Message(String username, String text) {
    this.username = username;
    this.text = text;
    this.id = rand.nextInt(9999999) + 1000000;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp() {
    this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
  }
}
