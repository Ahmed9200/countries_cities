package com.artLanguage.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table(name = "districts")
public class Districts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name_en")
    private String nameEn;

    @Column(name = "name_ar")
    private String nameAr;

    @Column(name = "name_fr")
    private String nameFr;

    @Column(name = "name_ar_cities")
    private String nameArCities;

    @Column(name = "name_en_cities")
    private String nameEnCities;

    @Column(name = "name_ar_regions")
    private String nameArRegions;

    @Column(name = "name_en_regions")
    private String nameEnRegions;

    @Column(name = "code")
    private String code;


}
