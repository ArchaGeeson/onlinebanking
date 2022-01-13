package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.IBankingDAO;
import com.solvd.onlinebanking.models.Banking;

public class BankingDAO extends AbstractMySqlDAO implements IBankingDAO<Banking> {

	@Override
	public void createEntity(Banking entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Banking entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Banking getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Banking> getBankingByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
