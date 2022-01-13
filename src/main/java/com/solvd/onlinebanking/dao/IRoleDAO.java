package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IRoleDAO<T> extends IBaseDAO<T>{
	List<T> getRoleByName(String roleName);
}
