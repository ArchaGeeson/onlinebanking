package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IOfferDAO<T> extends IBaseDAO<T>{
	List<T> getOfferByAccountId(int accountId);
}
