package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IBalanceHistoryDAO <T> extends IBaseDAO<T>{
	List<T> getBalanceHistoryByAccountId(int accountId);
}
