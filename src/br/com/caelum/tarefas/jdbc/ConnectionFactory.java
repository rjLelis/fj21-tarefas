package br.com.caelum.tarefas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String DATABASE_NAME = "postgres";
	private static final String URL = "jdbc:postgresql://localhost/" + DATABASE_NAME;
	private static final String USER =  "postgres";
	private static final String PASSWORD = "123456";
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			DriverManager.registerDriver(new org.postgresql.Driver());
			connection = DriverManager.getConnection(
					URL, USER, PASSWORD);
			return connection;
		} catch (SQLException exc) {
			throw new RuntimeException(exc);

		} catch (ClassNotFoundException exc) {
			exc.printStackTrace();
			throw new RuntimeException(exc);
		}
	}
}
