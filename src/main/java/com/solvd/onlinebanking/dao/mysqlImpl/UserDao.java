package com.solvd.onlinebanking.dao.mysqlImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.onlinebanking.dao.interfaces.IBaseDAO;
import com.solvd.onlinebanking.dao.interfaces.IUserDAO;
import com.solvd.onlinebanking.models.User;
import com.solvd.onlinebanking.utilities.ConnectionPool;

public class UserDAO extends AbstractMySqlDAO implements IBaseDAO<User>, IUserDAO<User> {

	private static final Logger log = LogManager.getLogger(UserDAO.class);
	private static final String GET_USERS_BY_ID = "Select * from User where id=?";
	private static final String CREATE_USER = "Insert into Users"
			+ " (id, first_ name, last_name, age, gender) VALUES (?, ?, ?, ?, ?)";
	private static final String UPDATE_USER = "Update User set age = ? where first_name = ?";
	private static final String DELETE_USER = "Delete from User where id = ?";
	private static final String GET_USER_BY_AGE = "Select * from User where age=?";

	@Override
	public void createEntity(User entity) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionPool.getPoolInstance().getConnection();
			statement = connection.prepareStatement(CREATE_USER);
			statement.setLong(1, 1);
			statement.setString(2, "first_name");
			statement.setString(3, "last_name");
			statement.setInt(4, 30);
			statement.setString(5, "gender");
			statement.executeQuery();

		} catch (Exception e) {
			log.error(e);
		} finally {
			statement.close();
			ConnectionPool.getPoolInstance().releaseConnection(connection);
		}
	}

	@Override
	public User getEntityById(long id) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		User user = null;
		try {
			connection = ConnectionPool.getPoolInstance().getConnection();
			statement = connection.prepareStatement(GET_USERS_BY_ID);
			statement.setLong(1, id);
			resultSet = statement.executeQuery();
			resultSetToUser(resultSet);
		} catch (Exception e) {
			log.error(e);
		} finally {
			resultSet.close();
			statement.close();
			ConnectionPool.getPoolInstance().releaseConnection(connection);
		}
		return user;
	}

	public User resultSetToUser(ResultSet resultSet) {
		User user = new User();

		try {
			user.setFirstName(resultSet.getString("first_name"));
			user.setLastName(resultSet.getString("last_name"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error(e);
		}
		return user;
	}

	@Override
	public void updateEntity(User entity) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		User user = null;
		try {
			connection = ConnectionPool.getPoolInstance().getConnection();
			statement = connection.prepareStatement(UPDATE_USER);
			statement.setInt(1, user.getAge());
			statement.setString(2, user.getFirstName());
			statement.executeUpdate();

		} catch (Exception e) {
			log.error(e);
		} finally {
			statement.close();
			ConnectionPool.getPoolInstance().releaseConnection(connection);
		}

	}

	@Override
	public void deleteEntity(long id) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = ConnectionPool.getPoolInstance().getConnection();
			statement = connection.prepareStatement(DELETE_USER);
			statement.setLong(1, id);
			statement.executeUpdate();

		} catch (Exception e) {
			log.error(e);
		} finally {
			statement.close();
			ConnectionPool.getPoolInstance().releaseConnection(connection);
		}

	}

	@Override
	public List<User> getUsersByAge(int age) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		List<User> users = new ArrayList<>();
		try {
			connection = ConnectionPool.getPoolInstance().getConnection();
			statement = connection.prepareStatement(GET_USER_BY_AGE);
			statement.setInt(1, age);;
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				User user = new User();
				user.setAge(resultSet.getInt("age"));
				user.setFirstName(resultSet.getString("first_name"));
				user.setLastName(resultSet.getString("last_name"));
				user.setGender(resultSet.getString("gender"));
				user.setType(resultSet.getString("user_type"));
				users.add(user);
				
			}
			log.info(users);
		} catch (Exception e) {
			log.error(e);
		} finally {
			resultSet.close();
			statement.close();
			ConnectionPool.getPoolInstance().releaseConnection(connection);
		}
		return users;
		
	}

}
