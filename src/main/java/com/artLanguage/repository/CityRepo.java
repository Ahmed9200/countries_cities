package com.artLanguage.repository;

import com.artLanguage.entities.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface CityRepo extends JpaRepository<Cities, Integer> {

    @Transactional
    @Override
    <S extends Cities> S save(S s);

    @Transactional
    List<Cities> findAllByCountryId(int counrtyId);

}
