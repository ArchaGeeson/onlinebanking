package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IUserDAO<T> extends IBaseDAO<T>{
	List<T> getUsersByAge(int age);

}
