package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IRoleDAO<T> extends IBaseDAO<T>{
	List<T> getRoleByName(String roleName);
}
