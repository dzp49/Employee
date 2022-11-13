package com.example.demo.DAO;

import com.example.demo.Model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

}
