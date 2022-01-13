package com.solvd.onlinebanking.dao;

import java.util.List;

public interface INotificationDAO<T> extends IBaseDAO<T>{
	List<T> getNotificationByAccountId(int accountId);
}
