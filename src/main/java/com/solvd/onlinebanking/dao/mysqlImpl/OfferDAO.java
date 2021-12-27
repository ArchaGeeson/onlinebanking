package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.interfaces.IOfferDAO;
import com.solvd.onlinebanking.models.Offer;

public class OfferDAO extends AbstractMySqlDAO implements IOfferDAO<Offer> {

	@Override
	public void createEntity(Offer entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Offer entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Offer getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Offer> getOfferByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
