package com.Service.EmployeeControllerService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@RequestMapping("/employee")
	public String employee() {
		return "Employees";
	}

}
