package com.db.reddit.services;

import com.db.reddit.models.Author;
import com.db.reddit.repositories.AuthorRepo;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class AuthorServiceImp implements AuthorService{

  AuthorRepo authorRepo;

  @Autowired
  public AuthorServiceImp(AuthorRepo authorRepo) {
    this.authorRepo = authorRepo;
  }

  @Override
  public void login(String username, String email) {
    if (authorRepo.findAuthorByEmail(email) == null) {
      authorRepo.save(new Author(username, email));
    }
  }

  @Override
  public Author getAuthor(Long id) {
    return getAuthor(id);
  }

  @Override
  public Boolean validator(String email) {
    Pattern pattern = Pattern.compile("^.+@.+\\..+$");
    Matcher matcher = pattern.matcher(email);
    return ((!email.isEmpty()) && (email!=null) && (matcher.matches()));
  }
}
