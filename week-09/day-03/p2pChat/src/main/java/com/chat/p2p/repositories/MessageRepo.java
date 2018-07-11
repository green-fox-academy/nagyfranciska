package com.chat.p2p.repositories;

import com.chat.p2p.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepo extends CrudRepository<Message, Long> {

  List<Message> findAll();
}
