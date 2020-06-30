package com.example.talent.serviceImplement;

import com.example.talent.dto.OfferDto;
import com.example.talent.model.Offer;
import com.example.talent.model.OfferEntity;
import com.example.talent.repository.HireRepository;
import com.example.talent.service.OfferService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class OfferServiceImpl implements OfferService {
    @Autowired
    HireRepository hireRepository;

    @Override
    public OfferDto createOffer(OfferDto offerDto) throws ParseException {
        OfferEntity offerEntity = new OfferEntity();
        BeanUtils.copyProperties(offerDto, offerEntity);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        Date todayWithZeroTime = formatter.parse(formatter.format(today));
        offerEntity.setDate(todayWithZeroTime.toString());
        offerEntity.setNumOfApp(0);
        OfferEntity savedEntity = hireRepository.save(offerEntity);
        OfferDto returnDto = new OfferDto();
        BeanUtils.copyProperties(savedEntity, returnDto);
        return returnDto;
    }
}
