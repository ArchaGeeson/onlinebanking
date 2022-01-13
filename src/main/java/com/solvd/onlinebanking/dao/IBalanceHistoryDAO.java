package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IBalanceHistoryDAO <T> extends IBaseDAO<T>{
	List<T> getBalanceHistoryByAccountId(int accountId);
}
