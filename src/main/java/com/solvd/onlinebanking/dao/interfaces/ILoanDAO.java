package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface ILoanDAO<T> extends IBaseDAO<T>{
	List<T> getLoanByAccountId(int accountId);
}
