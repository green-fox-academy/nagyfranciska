package com.db.reddit.repositories;

import com.db.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface PostRepo extends CrudRepository<Post, Long> {

  List<Post> findAll();
  Post findOneById(Long id);


}
