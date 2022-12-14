package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.AssignmentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentStatusRepository extends CrudRepository<AssignmentStatus, Integer> {

    List<AssignmentStatus> findAll();

    AssignmentStatus findByAssignmentStatusCode(int assignmentStatusCode);

}
