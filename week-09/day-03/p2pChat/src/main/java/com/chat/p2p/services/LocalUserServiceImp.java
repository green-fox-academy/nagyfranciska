package com.chat.p2p.services;

import com.chat.p2p.models.LocalUser;
import com.chat.p2p.repositories.LocalUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalUserServiceImp implements LocalUserService {

  @Autowired
  LocalUserRepo userRepo;

  @Override
  public void saveLocalUser(LocalUser localUser) {
    userRepo.save(localUser);
  }
}
