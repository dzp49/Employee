package com.example.demo.Service;

import com.example.demo.Model.EmployeeModel;
import com.example.demo.DAO.EmployeeRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EmployeeService {

    List<EmployeeModel> employeeModel= new ArrayList<>();
    EmployeeRepository employeeRepository;
    public EmployeeModel getById(int id) {
        employeeModel = employeeRepository.findAllById(Collections.singleton(id));
        return employeeModel.get(0);
    }
}
