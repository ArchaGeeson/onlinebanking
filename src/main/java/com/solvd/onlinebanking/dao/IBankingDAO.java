package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IBankingDAO<T> extends IBaseDAO<T>{
	List<T> getBankingByAccountId(int accountId);
}
