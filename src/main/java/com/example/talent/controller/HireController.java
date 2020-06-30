package com.example.talent.controller;


import com.example.talent.dto.AppDto;
import com.example.talent.dto.OfferDto;
import com.example.talent.model.AppEntity;
import com.example.talent.model.AppModel;
import com.example.talent.model.Offer;
import com.example.talent.model.OfferEntity;
import com.example.talent.repository.AppRepository;
import com.example.talent.repository.HireRepository;
import com.example.talent.service.AppService;
import com.example.talent.service.OfferService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class HireController {

    @Autowired
    OfferService offerService;

    @Autowired
    AppService appService;

    @Autowired
    AppRepository appRepository;

    @Autowired
    HireRepository hireRepository;

    @PostMapping("/hire")
    public String createJob(@RequestBody Offer offer) throws ParseException {
        OfferDto offerDto = new OfferDto();
        BeanUtils.copyProperties(offer,offerDto);
        OfferDto createDto = offerService.createOffer(offerDto);
        return "Job created";
    }

    @PostMapping("/apply")
    public String applyForJob(@RequestBody AppModel appModel)
    {

        AppDto appDto = new AppDto();
        BeanUtils.copyProperties(appModel, appDto);
        AppDto applyJobDto = appService.applyJob(appDto);
        appRepository.update(appModel.getOffer());
        return "Applied";
    }

    @RequestMapping(
            value = "findAll",
            method = RequestMethod.GET,
            produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
            headers = "Accept=application/json"
    )
    public ResponseEntity<Iterable<AppEntity>> findAll() {
        try {
            return new ResponseEntity<Iterable<AppEntity>>(appService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Iterable<AppEntity>>(HttpStatus.BAD_REQUEST);
        }

    }

}
