package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.interfaces.IFormDAO;
import com.solvd.onlinebanking.models.Form;

public class FormDAO extends AbstractMySqlDAO implements IFormDAO<Form> {

	@Override
	public void createEntity(Form entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Form entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Form getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Form> getFormByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
