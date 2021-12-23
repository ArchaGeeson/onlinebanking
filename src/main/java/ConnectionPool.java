import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.*;
import java.util.concurrent.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ConnectionPool {
	private static ConnectionPool pooliInstance;
	private static final int MAX_POOL_SIZE= 5;
	private static String url = "52.59.193.212:3306";
	private static String userName = "root";
	private static String password = "devintern";
	private List<Connection> connections = new CopyOnWriteArrayList<>();
	private static Logger log = LogManager.getLogger(ConnectionPool.class.getName()); 
	
	private ConnectionPool() {
		
	}

	public static ConnectionPool getInstance() {
		if (pooliInstance == null) {
			pooliInstance = new ConnectionPool();

		}
		return pooliInstance;
	}

	public synchronized Connection getConnection() {
		Connection connection = null;
		if(!connections.isEmpty() && connections.size() <MAX_POOL_SIZE) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url, userName, password);
			}catch(Exception e) {
				log.error(e);
			}
		}
		return connection;
		
	}
}

