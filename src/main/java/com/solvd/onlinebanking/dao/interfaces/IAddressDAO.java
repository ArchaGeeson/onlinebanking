package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IAddressDAO<T> extends IBaseDAO<T>{
	List<T> getAddressByUserId(int userId);

}
