package com.solvd.onlinebanking.dao;

import java.sql.SQLException;

public interface IBaseDAO <T>{
	void createEntity(T entity) throws SQLException;
	T getEntityById(long id) throws SQLException;
	void updateEntity(T entity) throws SQLException;
	void deleteEntity(long id) throws SQLException;
}
