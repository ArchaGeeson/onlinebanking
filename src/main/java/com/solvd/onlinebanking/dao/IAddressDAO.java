package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IAddressDAO<T> extends IBaseDAO<T>{
	List<T> getAddressByUserId(int userId);

}
