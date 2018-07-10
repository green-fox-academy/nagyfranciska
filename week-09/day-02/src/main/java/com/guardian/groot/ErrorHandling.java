package com.guardian.groot;

public class ErrorHandling {

  private String error;

  public ErrorHandling() {
  }

  public ErrorHandling(String message) {
    this.error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
