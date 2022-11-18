package com.datajpa.EmployeeDataService;
import org.springframework.data.repository.CrudRepository;
import com.datajpa.EmployeeServer.*;

public interface EmployeeRespository extends CrudRepository<Employee, String>{

	
	
}
