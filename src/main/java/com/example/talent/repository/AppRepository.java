package com.example.talent.repository;

import com.example.talent.model.AppEntity;
import org.springframework.data.repository.CrudRepository;

public interface AppRepository extends CrudRepository<AppEntity, Integer> {

}
