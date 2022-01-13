package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IStatementDAO<T> extends IBaseDAO<T>{
	List<T> getStatementByAccountId(int accountId);
}
