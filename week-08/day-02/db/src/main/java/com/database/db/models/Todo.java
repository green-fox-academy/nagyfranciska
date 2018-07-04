package com.database.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean IsUrgent = false;
  private boolean IsDone = false;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
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

  public boolean isUrgent() {
    return IsUrgent;
  }

  public void setUrgent(boolean urgent) {
    IsUrgent = urgent;
  }

  public boolean isDone() {
    return IsDone;
  }

  public void setDone(boolean done) {
    IsDone = done;
  }
}
