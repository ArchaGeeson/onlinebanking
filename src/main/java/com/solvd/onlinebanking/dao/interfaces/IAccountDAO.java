package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IAccountDAO<T> extends IBaseDAO<T>{
	List<T> getAccountByUserId(long userId);
}
