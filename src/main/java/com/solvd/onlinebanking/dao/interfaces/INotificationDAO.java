package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface INotificationDAO<T> extends IBaseDAO<T>{
	List<T> getNotificationByAccountId(int accountId);
}
