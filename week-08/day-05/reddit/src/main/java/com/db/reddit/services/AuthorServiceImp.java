package com.db.reddit.services;

import com.db.reddit.repositories.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImp implements AuthorService{

  AuthorRepo authorRepo;

  @Autowired
  public AuthorServiceImp(AuthorRepo authorRepo) {
    this.authorRepo = authorRepo;
  }
}
