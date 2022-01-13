package com.solvd.onlinebanking.dao;

import java.util.List;

public interface IInterestDAO<T> extends IBaseDAO<T>{
	List<T> getInterestById(int id);
}
