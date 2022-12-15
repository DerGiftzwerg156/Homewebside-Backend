package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.Assignment;
import com.homewebside.homewebsidebackend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentsRepository extends CrudRepository<Assignment, Integer> {

    List<Assignment> findAllByUserId(User user);

    List<Assignment> findAll();

    Assignment findById(int assignment_id);
}
