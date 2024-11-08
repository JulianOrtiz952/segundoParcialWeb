package com.ufps.edu.co.SegundoParcialWeb.repository;

import com.ufps.edu.co.SegundoParcialWeb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
