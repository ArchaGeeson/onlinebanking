package com.solvd.onlinebanking.services;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.onlinebanking.dao.interfaces.IAccountDAO;
import com.solvd.onlinebanking.dao.interfaces.IUserDAO;
import com.solvd.onlinebanking.dao.mysqlImpl.AccountDAO;
import com.solvd.onlinebanking.dao.mysqlImpl.UserDAO;
import com.solvd.onlinebanking.models.Account;
import com.solvd.onlinebanking.models.User;
import com.solvd.onlinebanking.services.interfaces.IUserService;

public class UserService implements IUserService {
	
	private static final Logger log = LogManager.getLogger(UserService.class);
	private IUserDAO<User> userDAO = new UserDAO();
	private IAccountDAO<Account> accountDAO = new AccountDAO();

	@Override
	public User getUserById(long id) {
		User user = null;
		try {
			user = userDAO.getEntityById(id);
		} catch (SQLException e) {
			log.error(e);
		}
		user.setListOfAccounts(accountDAO.getAccountByUserId(user.getId()));
		return user;
	}
}
