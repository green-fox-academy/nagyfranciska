package com.chat.p2p.services;

import com.chat.p2p.models.Client;

public interface ClientService {

  boolean clientExists();
  Client getClient();
  void saveClient(Client client);
  void update(Client client);
}
