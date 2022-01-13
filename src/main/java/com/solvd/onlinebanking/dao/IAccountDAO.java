package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IAccountDAO<T> extends IBaseDAO<T>{
	List<T> getAccountByUserId(long userId);
}
