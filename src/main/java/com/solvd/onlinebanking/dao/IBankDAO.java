package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IBankDAO<T> extends IBaseDAO<T>{
	List<T> getBankByName(String name);
}
