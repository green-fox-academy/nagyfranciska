package com.db.reddit.models;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String content;
  private int score = 0;
  private String createAt;

  public Post() {
  }

  public Post(String title, String content) {
    this.title = title;
    this.content = content;
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
    score += number;
  }

  public void setTimeStamp() {
    createAt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
  }

  public String getCreateAt() {
    return createAt;
  }

  public void setCreateAt(String createAt) {
    this.createAt = createAt;
  }
}
