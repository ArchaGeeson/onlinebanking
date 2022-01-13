package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.ILoanDAO;
import com.solvd.onlinebanking.models.Loan;

public class LoanDAO extends AbstractMySqlDAO implements ILoanDAO<Loan> {

	@Override
	public void createEntity(Loan entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Loan entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Loan getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Loan> getLoanByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
