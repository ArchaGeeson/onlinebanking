package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IBankDAO<T> extends IBaseDAO<T>{
	List<T> getBankByName(String name);
}
