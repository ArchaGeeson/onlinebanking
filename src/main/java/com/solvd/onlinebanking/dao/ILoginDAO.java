package com.solvd.onlinebanking.dao;

import java.util.List;

public interface ILoginDAO<T> extends IBaseDAO<T>{
	List<T> getLoginByAccountId(int accountId);
}
