package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface ILoginDAO<T> extends IBaseDAO<T>{
	List<T> getLoginByAccountId(int accountId);
}
