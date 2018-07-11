package com.chat.p2p.services;

import com.chat.p2p.models.Message;
import com.chat.p2p.models.dataTransferObjects.DTO;

import java.util.List;

public interface MessageService {

  void saveMessage(Message m);
  List<Message> findAll();
  boolean checkDTO(DTO dto);
}
