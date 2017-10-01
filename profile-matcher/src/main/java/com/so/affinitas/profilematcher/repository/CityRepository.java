package com.so.affinitas.profilematcher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.so.affinitas.profilematcher.entity.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
