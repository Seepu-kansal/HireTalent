package com.example.talent.serviceImplement;

import com.example.talent.dto.AppDto;
import com.example.talent.model.AppEntity;
import com.example.talent.repository.AppRepository;
import com.example.talent.service.AppService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("appService")
public class AppServiceImpl implements AppService {

    @Autowired
    AppRepository appRepository;

    @Override
    public Iterable<AppEntity> findAll() {
        return appRepository.findAll();
    }

    @Override
    public AppDto applyJob(AppDto appDto) {

        AppEntity appEntity = new AppEntity();
        BeanUtils.copyProperties(appDto, appEntity);
        AppEntity savedEntity = appRepository.save(appEntity);
        AppDto returnAppDto = new AppDto();
        BeanUtils.copyProperties(savedEntity, returnAppDto);
        return returnAppDto;
    }
}
