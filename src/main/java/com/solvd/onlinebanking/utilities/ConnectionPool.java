package com.solvd.onlinebanking.utilities;

import java.io.File;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.util.concurrent.*;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionPool {

	private static ConnectionPool pooliInstance;
	private List<Connection> connections = new CopyOnWriteArrayList<>();
	private static Logger log = LogManager.getLogger(ConnectionPool.class.getName());

	private ConnectionPool() {
		for (int i = 0; i < 3; i++) {
			Connection connection = null;
			Configurations configurations = new Configurations();
			try {
				Configuration config = configurations.properties(new File(
						"C:\\Users\\archa\\eclipse-workspace\\onlinebanking\\src\\main\\resources\\db.properties"));

				String url = config.getString("url");
				String username = config.getString("userName");
				String password = config.getString("password");
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url, username, password);
				connections.add(connection);
			} catch (Exception e) {
				log.error(e);
			}
		}
	}

	public static ConnectionPool getPoolInstance() {
		if (pooliInstance == null) {

			synchronized (ConnectionPool.class) {
				if (pooliInstance == null) {
					pooliInstance = new ConnectionPool();
				}
			}
		}
		return pooliInstance;
	}

	public synchronized Connection getConnection() {
		Connection connection = null;

		if (isConnectionAailable()) {
			log.info("pool size= " + connections.size());
			connection = connections.get(0);
			connections.remove(0);
			log.info("pool size after = " + connections.size());
		}

		return connection;
	}

	public synchronized void releaseConnection(Connection connection) {
		connections.add(connection);
	}

	private boolean isConnectionAailable() {
		if (connections.isEmpty()) {
			try {
				log.info("connection is empty");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
			isConnectionAailable();
		} else {
			throw new RuntimeException("Maximum pool size reached, no available connections!");
		}
		return true;
	}
}
