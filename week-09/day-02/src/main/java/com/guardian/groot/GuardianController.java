package com.guardian.groot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> getGroot(@RequestParam(value = "message", required = false) String somemessage) {
    if (somemessage == null) {
      return new ResponseEntity(new ErrorHandling("I am Groot!"), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(new Groot(somemessage), HttpStatus.OK);
  }

  @GetMapping("/yondu")
  public ResponseEntity<?> getYondu(@RequestParam(value = "distance", required = false) Double distance, @RequestParam(value = "time", required = false) Double time) {
    if (distance == null || time == null) {
      return new ResponseEntity(new ErrorHandling("Missing parameters"), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(new Yondu(distance, time), HttpStatus.OK);
  }
}
