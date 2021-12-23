package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IEmployeeDAO<T> extends IBaseDAO<T>{
	List<T> getEmployeeById(int employeeId);
}
