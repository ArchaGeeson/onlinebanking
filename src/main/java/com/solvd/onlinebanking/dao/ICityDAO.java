package com.solvd.onlinebanking.dao;

import java.util.List;

public interface ICityDAO<T> extends IBaseDAO<T>{
	List<T> getCityByName(String cityName);

}
