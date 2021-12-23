package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.interfaces.ITransactionDAO;
import com.solvd.onlinebanking.models.Transaction;

public class TransactionDAO extends AbstractMySqlDAO implements ITransactionDAO<Transaction> {

	public void createEntity(Transaction entity) {
		// TODO Auto-generated method stub
		
	}

	public void updateEntity(Transaction entity) {
		// TODO Auto-generated method stub
		
	}

	public Transaction getEntity(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEntity(long id) {
		// TODO Auto-generated method stub
		
	}

	public List<Transaction> getTransactionByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
