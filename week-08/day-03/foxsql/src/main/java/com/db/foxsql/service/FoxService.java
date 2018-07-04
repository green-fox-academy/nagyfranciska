package com.db.foxsql.service;

import com.db.foxsql.model.Fox;

public interface FoxService {

  void login(String fox);
  Fox getFox(String fox);
}
