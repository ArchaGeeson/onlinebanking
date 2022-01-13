package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.IStatementDAO;
import com.solvd.onlinebanking.models.Statement;

public class StatementDAO extends AbstractMySqlDAO implements IStatementDAO<Statement> {

	@Override
	public void createEntity(Statement entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Statement entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Statement getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Statement> getStatementByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
