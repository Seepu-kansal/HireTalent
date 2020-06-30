package com.example.talent.repository;

import com.example.talent.model.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<AppEntity, Integer> {

    @Modifying
    @Query("update offer set numOfApp = numOfApp + 1 where jobTitle=offer")
    public void update(@Param("offer") String offer);

}
