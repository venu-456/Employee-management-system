package com.team.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
}
