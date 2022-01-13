package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IStateDAO<T> extends IBaseDAO<T>{
	List<T> getStateByName(String name);

}
