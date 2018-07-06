package com.db.reddit.models;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String content;
  private int score;
  private LocalDateTime createdAt;
  private String dateOfCreation;
  //private List<Author> authors = new ArrayList<>();

  public Post() {
  }

  public Post(String title, String content) {
    this.title = title;
    this.content = content;
    this.score = 0;
    setTimeStamp();
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

  public void incrementScore(int number) {
    this.score += number;
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

  public void setCreatedAt() {
    this.createdAt = LocalDateTime.now();
  }

  public String getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(String dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }

  public void setTimeStamp() {
    dateOfCreation = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
  }
}
