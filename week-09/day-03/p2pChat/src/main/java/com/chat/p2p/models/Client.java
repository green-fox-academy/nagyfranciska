package com.chat.p2p.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {



  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  private long realId;

  private String id;

  public Client() {
  }

  public Client(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
