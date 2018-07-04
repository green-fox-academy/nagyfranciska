package com.db.foxsql.repository;

import com.db.foxsql.model.Fox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepo extends CrudRepository<Fox, String> {

  Fox findFoxByName(String foxName);
  void save(Fox fox);
}
