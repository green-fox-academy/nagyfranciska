package com.db.reddit.services;

import com.db.reddit.models.Post;

import java.util.List;

public interface PostService {

  List<Post> findAll();
  Post findOneById(Long id);
  void save(String title, String content);
  Boolean validator(String url);
  void save(Post post);
}
