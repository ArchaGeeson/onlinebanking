package com.solvd.onlinebanking.dao.interfaces;

public interface IBaseDAO <T>{
	void createEntity(T entity);
	void updateEntity(T entity);
	T getEntity(long id);
	void deleteEntity(long id);
}
