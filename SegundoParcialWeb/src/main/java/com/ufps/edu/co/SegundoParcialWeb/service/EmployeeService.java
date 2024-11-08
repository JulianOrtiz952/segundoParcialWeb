package com.ufps.edu.co.SegundoParcialWeb.service;

import com.ufps.edu.co.SegundoParcialWeb.entity.Employee;
import com.ufps.edu.co.SegundoParcialWeb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee postEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

}
