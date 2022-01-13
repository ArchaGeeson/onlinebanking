package com.solvd.onlinebanking.dao;

import java.util.List;

public interface ITransactionDAO<T> extends IBaseDAO<T>{
	List<T> getTransactionByAccountId(int accountId);
}
