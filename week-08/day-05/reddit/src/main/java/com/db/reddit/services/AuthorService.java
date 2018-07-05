package com.db.reddit.services;

import com.db.reddit.models.Author;

public interface AuthorService {

  void login(String username, String email);
  Author getAuthor(Long id);
  Boolean validator(String email);
}
