package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IOfferDAO<T> extends IBaseDAO<T>{
	List<T> getOfferByAccountId(int accountId);
}
