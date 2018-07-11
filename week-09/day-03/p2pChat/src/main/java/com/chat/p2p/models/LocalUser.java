package com.chat.p2p.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LocalUser {

  @Id
  private long id;
  private String username;

  public LocalUser() {
  }

  public LocalUser(String username) {
    this.username = username;
    this.id = 1;
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
}
