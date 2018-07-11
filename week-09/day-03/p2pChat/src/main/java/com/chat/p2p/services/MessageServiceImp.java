package com.chat.p2p.services;

import com.chat.p2p.models.Message;
import com.chat.p2p.models.dataTransferObjects.DTO;
import com.chat.p2p.repositories.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImp implements MessageService {

  @Autowired
  MessageRepo messageRepo;

  @Override
  public void saveMessage(Message m) {
    messageRepo.save(m);

  }

  @Override
  public List<Message> findAll() {
    return messageRepo.findAll();
  }

  @Override
  public boolean checkDTO(DTO dto) {
    DTO pack = dto;
    return (pack.getMessage().getId() != 0 &&
      pack.getMessage().getUsername() != null &
      pack.getMessage().getText() != null &&
      pack.getMessage().getTimestamp() != null &&
      pack.getClient().getId() != null);
  }
}
