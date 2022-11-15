package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.PlaColor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlacolorsRepository extends CrudRepository<PlaColor,Integer> {

    PlaColor findByColor(String color);

    List<PlaColor> findAll();
}
