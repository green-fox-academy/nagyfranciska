package com.db.reddit.repositories;

import com.db.reddit.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface AuthorRepo extends CrudRepository<Author, Long> {

  Author findAuthorByEmail(String email);
}
