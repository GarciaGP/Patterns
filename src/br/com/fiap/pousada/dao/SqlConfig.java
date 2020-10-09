package br.com.fiap.pousada.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Implementa��o do arquivo de configura��o atrav�s do singleton
public class SqlConfig {

	public static SqlConfig instance;

	private SqlConfig() {
	}

	public static synchronized SqlConfig getInstance() {
		if (instance == null)
			instance = new SqlConfig();
		return instance;
	}

	public Connection getConfig() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Especificar usu�rio e senha do banco nos �ltimos par�metros
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM86288", "210196");
			return conn;

		} catch (ClassNotFoundException e) {
			System.err.printf("N�o foi poss�vel localizar o driver: %s", e.getMessage());
			return null;
		} catch (SQLException e) {
			System.err.println("Ocorreu um erro na conex�o com o banco de dados");
			System.err.println(e.getMessage());
			return null;
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
