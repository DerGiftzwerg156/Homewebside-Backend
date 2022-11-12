package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.PlaColor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacolorsRepository extends CrudRepository<PlaColor,Integer> {

    PlaColor findByColor(String color);
}
