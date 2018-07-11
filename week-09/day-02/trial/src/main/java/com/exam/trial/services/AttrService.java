package com.exam.trial.services;

import com.exam.trial.models.Attraction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttrService {

  List<Attraction> getAll();
  void save(Attraction attraction);
}
