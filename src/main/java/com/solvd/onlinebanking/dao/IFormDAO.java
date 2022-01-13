package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IFormDAO<T> extends IBaseDAO<T>{
	List<T> getFormByAccountId(int accountId);
}
