package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.AssignmentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentStatusRepository extends CrudRepository<AssignmentStatus,Integer> {

    AssignmentStatus findByStatusCode(int statusCode);
}
