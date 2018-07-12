package com.chat.p2p.contollers;

import com.chat.p2p.models.Error;
import com.chat.p2p.models.Succes;
import com.chat.p2p.models.dataTransferObjects.DTO;
import com.chat.p2p.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatRestController {

  @Autowired
  MessageService messageService;



  @PostMapping("/api/message/receive")
  @CrossOrigin("*")
  public ResponseEntity<?> receiveMessage(@RequestBody DTO dto) {
    if (messageService.checkDTO(dto)) {
      messageService.saveMessage(dto.getMessage());
      return ResponseEntity.status(HttpStatus.OK).body(new Succes("ok"));
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("error", "Missing field(s): iterate somehow, find solution later"));
  }
}
