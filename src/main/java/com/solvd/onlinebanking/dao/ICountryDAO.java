package com.solvd.onlinebanking.dao;

import java.util.List;

public interface ICountryDAO<T> extends IBaseDAO<T>{
	List<T> getCountryByName(String countryName);

}
