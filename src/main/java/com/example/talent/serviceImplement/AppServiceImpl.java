package com.example.talent.serviceImplement;

import com.example.talent.model.AppEntity;
import com.example.talent.repository.AppRepository;
import com.example.talent.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("appService")
public class AppServiceImpl implements AppService {

    @Autowired
    AppRepository appRepository;

    @Override
    public Iterable<AppEntity> findAll() {
        return appRepository.findAll();
    }
}
