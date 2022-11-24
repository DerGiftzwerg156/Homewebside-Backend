package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends CrudRepository<News, Integer> {

    List<News> findAll();
}
