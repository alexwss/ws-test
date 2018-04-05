package br.com.unimed.fabricaConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "bpm", "bpm");
			
		} catch (ClassNotFoundException e) {

			throw new SQLException(e.getMessage());

		}
	}
}
