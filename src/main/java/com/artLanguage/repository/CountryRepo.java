package com.artLanguage.repository;

import com.artLanguage.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CountryRepo extends JpaRepository<Countries, Integer> {


    @Transactional
    @Override
    <S extends Countries> S save(S s);

    Countries findByCode(String code);

}
