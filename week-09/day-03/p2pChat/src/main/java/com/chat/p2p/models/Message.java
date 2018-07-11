package com.chat.p2p.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Entity
public class Message {

  @Id
  private long id;
  private String username;
  private String text;
  private String timestamp;

  public Message() {
  }

  public Message(String username, String text) {
    Random rand = new Random();
    this.username = username;
    this.text = text;
    this.id = rand.nextInt(9999999) + 1000000;
    this.timestamp = stamp();
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

  public void setTimestamp(String timestamp) {
  }

  public String stamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
  }
}
