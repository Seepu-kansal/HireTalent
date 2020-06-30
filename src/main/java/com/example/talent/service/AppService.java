package com.example.talent.service;

import com.example.talent.dto.AppDto;
import com.example.talent.model.AppEntity;

public interface AppService {

    public Iterable<AppEntity>findAll();

    AppDto applyJob(AppDto appDto);
}
