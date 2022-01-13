package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.IBankDAO;
import com.solvd.onlinebanking.models.Bank;

public class BankDAO extends AbstractMySqlDAO implements IBankDAO<Bank> {

	@Override
	public void createEntity(Bank entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Bank entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Bank getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Bank> getBankByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
