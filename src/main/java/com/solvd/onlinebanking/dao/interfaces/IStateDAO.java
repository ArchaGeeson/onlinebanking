package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IStateDAO<T> extends IBaseDAO<T>{
	List<T> getStateByName(String name);

}
