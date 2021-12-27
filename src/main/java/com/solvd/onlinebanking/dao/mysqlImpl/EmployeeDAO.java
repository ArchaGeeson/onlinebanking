package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.interfaces.IEmployeeDAO;
import com.solvd.onlinebanking.models.Employee;

public class EmployeeDAO extends AbstractMySqlDAO implements IEmployeeDAO<Employee> {

	@Override
	public void createEntity(Employee entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Employee entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
