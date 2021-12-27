package com.solvd.onlinebanking.dao.mysqlImpl;

import java.util.List;

import com.solvd.onlinebanking.dao.interfaces.INotificationDAO;
import com.solvd.onlinebanking.models.Notification;

public class NotificationDAO extends AbstractMySqlDAO implements INotificationDAO<Notification> {

	@Override
	public void createEntity(Notification entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntity(Notification entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Notification getEntityById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Notification> getNotificationByAccountId(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
