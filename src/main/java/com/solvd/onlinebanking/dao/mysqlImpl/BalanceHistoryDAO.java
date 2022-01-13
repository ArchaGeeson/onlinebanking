package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.IBalanceHistoryDAO;
import com.solvd.onlinebanking.models.BalanceHistory;

public class BalanceHistoryDAO extends AbstractMySqlDAO implements IBalanceHistoryDAO<BalanceHistory> {

	@Override
	public void createEntity(BalanceHistory entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(BalanceHistory entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public BalanceHistory getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BalanceHistory> getBalanceHistoryByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
