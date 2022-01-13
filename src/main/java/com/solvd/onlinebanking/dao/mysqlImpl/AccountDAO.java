package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.IAccountDAO;
import com.solvd.onlinebanking.models.Account;

public class AccountDAO extends AbstractMySqlDAO implements IAccountDAO<Account> {

	@Override
	public void createEntity(Account entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Account entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Account> getAccountByUserId(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
