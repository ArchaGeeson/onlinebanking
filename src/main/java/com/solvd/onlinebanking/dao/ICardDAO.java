package com.solvd.onlinebanking.dao;

import java.util.List;

public interface ICardDAO<T> extends IBaseDAO<T>{
	List<T> geCardByAccountId(int accountId);
}
