package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IEmployeeDAO<T> extends IBaseDAO<T>{
	List<T> getEmployeeById(int employeeId);
}
