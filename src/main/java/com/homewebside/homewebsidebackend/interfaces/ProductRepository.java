package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findAll();
}
