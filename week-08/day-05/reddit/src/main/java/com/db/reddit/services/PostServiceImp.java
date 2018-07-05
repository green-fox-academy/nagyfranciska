package com.db.reddit.services;

import com.db.reddit.models.Post;
import com.db.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PostServiceImp implements PostService{

  PostRepo postRepo;

  @Autowired
  public PostServiceImp(PostRepo postRepo) {
    this.postRepo = postRepo;
  }

  @Override
  public List<Post> findAll() {
    return postRepo.findAll();
  }

  @Override
  public void save(String title, String content) {
    postRepo.save(new Post(title, content));
  }

  @Override
  public Boolean validator(String url) {
    Pattern pattern = Pattern.compile("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");
    Matcher matcher = pattern.matcher(url);
    return ((!url.isEmpty()) && (url!=null) && (matcher.matches()));
  }
}
