package com.exam.trial.repositories;

import com.exam.trial.models.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttrRepository extends CrudRepository<Attraction, Integer> {

}
