package com.example.talent.service;

import com.example.talent.dto.OfferDto;

import java.text.ParseException;

public interface OfferService {

    OfferDto createOffer(OfferDto offerDto) throws ParseException;
}
