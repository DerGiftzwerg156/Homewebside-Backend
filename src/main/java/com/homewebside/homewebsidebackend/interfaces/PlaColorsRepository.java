package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.PlaColor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaColorsRepository extends CrudRepository<PlaColor,Integer> {

    PlaColor findByPlaColorId(int plaColorId);

    PlaColor findByColor(String color);

    List<PlaColor> findAll();
}
