package com.employee.Empsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.Empsystem.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{
	
}
