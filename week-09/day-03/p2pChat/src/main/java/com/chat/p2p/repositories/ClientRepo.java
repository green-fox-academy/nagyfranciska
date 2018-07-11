package com.chat.p2p.repositories;

import com.chat.p2p.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends CrudRepository<Client, String> {
  List<Client> findAll();
}
