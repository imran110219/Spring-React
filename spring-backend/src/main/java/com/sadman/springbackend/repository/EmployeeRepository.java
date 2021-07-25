package com.sadman.springbackend.repository;

import com.sadman.springbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sadman
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}