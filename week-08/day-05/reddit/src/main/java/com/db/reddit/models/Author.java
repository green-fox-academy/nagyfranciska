package com.db.reddit.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String username;
  private String email;
  //private List<Post> posts = new ArrayList<>();

  public Author() {
  }

  public Author(String username, String email) {
    this.username = username;
    this.email = email;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

//  public List<Post> getPosts() {
//    return posts;
//  }
//
//  public void setPosts(List<Post> posts) {
//    this.posts = posts;
//  }
}

