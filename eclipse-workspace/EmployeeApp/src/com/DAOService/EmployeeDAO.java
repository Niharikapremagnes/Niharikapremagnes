package com.DAOService;

import java.sql.SQLException;

import com.modelService.Employee;

public interface EmployeeDAO {
	public boolean insertEmployee(Employee employee) throws SQLException;
	public String retrieveEmployee(int id) throws SQLException;
	public boolean updateEmployee(int id, int age) throws SQLException;
	public boolean deleteEmployee(int id) throws SQLException;
	public boolean getEmployeeNames() throws SQLException;
}
