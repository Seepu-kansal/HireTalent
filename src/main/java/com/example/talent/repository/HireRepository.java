package com.example.talent.repository;

import com.example.talent.model.OfferEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HireRepository extends CrudRepository<OfferEntity, Integer> {

}
