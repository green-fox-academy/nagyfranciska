package com.chat.p2p.repositories;

import com.chat.p2p.models.LocalUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalUserRepo extends CrudRepository<LocalUser, Long> {

  LocalUser findAllByIdExists();
}
