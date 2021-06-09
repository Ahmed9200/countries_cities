package com.artLanguage.repository;

import com.artLanguage.entities.Districts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DistrictsRepo extends JpaRepository<Districts, Integer> {

    @Transactional
    @Override
    <S extends Districts> S save(S s);

    @Transactional
    List<Districts> findAllByNameArCities(String name);

}
