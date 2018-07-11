package com.chat.p2p.services;

import com.chat.p2p.models.Client;
import com.chat.p2p.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImp implements ClientService {

  @Autowired
  ClientRepo clientRepo;

  @Override
  public boolean clientExists() {
    if (clientRepo.count() >= 1) {
      return true;
    }
    return false;
  }

  @Override
  public Client getClient() {
    return clientRepo.findAll().get(0);
  }

  @Override
  public void saveClient(Client client) {
    clientRepo.save(client);
  }

  @Override
  public void update(Client client) {
    clientRepo.save(client);
  }
}
