package com.example.springboot.service.impl;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;
import com.example.springboot.service.EmployeeService;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        super();
        this.employeeRepository=employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
