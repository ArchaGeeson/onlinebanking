package com.solvd.onlinebanking.dao.interfaces;

import java.util.List;

public interface IInterestDAO<T> extends IBaseDAO<T>{
	List<T> getInterestById(int id);
}
