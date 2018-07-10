package com.exam.trial.services;

import com.exam.trial.models.Attraction;
import com.exam.trial.repositories.AttrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttrServiceImp implements AttrService{

  @Autowired
  AttrRepository attrRepository;

  @Override
  public List<Attraction> getAll() {
    List<Attraction> listOfAttractions = new ArrayList<>();
    attrRepository.findAll().forEach(listOfAttractions::add);
    return listOfAttractions;
  }
}
