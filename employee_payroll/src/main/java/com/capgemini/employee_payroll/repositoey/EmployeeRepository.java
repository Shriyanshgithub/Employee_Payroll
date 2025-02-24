package com.capgemini.employee_payroll.repositoey;


import com.capgemini.employee_payroll.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//repository for employee
@Component
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
