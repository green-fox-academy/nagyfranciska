package com.db.reddit.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String content;
  private int score = 0;
  private LocalDateTime createdAt;
  //private List<Author> authors = new ArrayList<>();

  public Post() {
  }

  public Post(String title, String content) {
    this.title = title;
    this.content = content;
    this.createdAt = LocalDateTime.now();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

//  public List<Author> getAuthors() {
//    return authors;
//  }
//
//  public void setAuthors(List<Author> authors) {
//    this.authors = authors;
//  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
}
