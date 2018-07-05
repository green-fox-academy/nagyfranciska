package com.db.reddit.services;

import com.db.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService{

  PostRepo postRepo;

  @Autowired
  public PostServiceImp(PostRepo postRepo) {
    this.postRepo = postRepo;
  }
}
