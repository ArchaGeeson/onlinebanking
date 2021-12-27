package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.interfaces.ICardDAO;
import com.solvd.onlinebanking.models.Card;

public class CardDAO extends AbstractMySqlDAO implements ICardDAO<Card> {

	@Override
	public void createEntity(Card entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Card entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Card getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Card> geCardByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
