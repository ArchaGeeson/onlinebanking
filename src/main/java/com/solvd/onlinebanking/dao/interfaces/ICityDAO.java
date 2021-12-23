package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface ICityDAO<T> extends IBaseDAO<T>{
	List<T> getCityByName(String cityName);

}
