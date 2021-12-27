package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.interfaces.ILoginDAO;
import com.solvd.onlinebanking.models.Login;

public class LoginDAO extends AbstractMySqlDAO implements ILoginDAO<Login> {

	@Override
	public void createEntity(Login entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Login entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Login getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Login> getLoginByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
