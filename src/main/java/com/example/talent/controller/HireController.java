package com.example.talent.controller;


import com.example.talent.model.AppEntity;
import com.example.talent.model.AppModel;
import com.example.talent.model.Offer;
import com.example.talent.repository.AppRepository;
import com.example.talent.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HireController {

    @Autowired
    AppService appService;

    @PostMapping(value = "/hire")
    public String createJob(@RequestBody Offer offer)
    {
        return "Job Created";
    }

    @PostMapping(value = "/apply")
    public String applyForJob(@RequestBody AppModel appModel)
    {
        return "Applied";
    }

    @RequestMapping(
            value = "findall",
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
