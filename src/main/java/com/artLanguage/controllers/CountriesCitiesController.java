package com.artLanguage.controllers;

import com.artLanguage.services.CountryCitiesService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CountriesCitiesController {

    @Autowired
    CountryCitiesService service;


    @PostMapping(value = "/districtsCity", produces = {"application/json"})
    @ResponseBody
    public Object districtsCity(@RequestBody String city) {
        return service.logicDistrictsCity(new JSONObject(city).getString("city"));
    }
    // end districtsCity


    @PostMapping(value = "/citiesCountry", produces = {"application/json"})
    @ResponseBody
    public Object citiesCountry(@RequestBody String countryCode) {
        return service.logicCitiesCountry(new JSONObject(countryCode).getString("countryCode"));
    }
    // end citiesCountry


}


