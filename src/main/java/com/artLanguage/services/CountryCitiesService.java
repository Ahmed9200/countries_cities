package com.artLanguage.services;

import com.artLanguage.entities.Countries;
import com.artLanguage.entities.Districts;
import com.artLanguage.repository.CityRepo;
import com.artLanguage.repository.CountryRepo;
import com.artLanguage.repository.DistrictsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CountryCitiesService {

    @Autowired
    CityRepo cityRepo;

    @Autowired
    CountryRepo countryRepo;

    @Autowired
    DistrictsRepo districtsRepo;


    public Object logicDistrictsCity(String cityName) {
        try {
            List<Districts> districtsList = districtsRepo.findAllByNameArCitiesLike(cityName);
            if (districtsList == null || districtsList.size() == 0) {
                String s = cityName.substring(0,cityName.length()-1);
                return districtsRepo.findAllByNameArCitiesLike(s+"%");
            } else
                return districtsList;

        } catch (Exception e) {
            e.printStackTrace();
            Map<Object, Object> res = new HashMap<>();
            res.put("error", e.getMessage());
            return res;
        }
    }

    public Object logicCitiesCountry(String countryCode) {

        try {
            return cityRepo.findAllByCountryId(
                    countryRepo.findByCode(countryCode).getId());

        } catch (Exception e) {
            e.printStackTrace();
            Map<Object, Object> res = new HashMap<>();
            res.put("error", e.getMessage());
            return res;
        }
    }
}
