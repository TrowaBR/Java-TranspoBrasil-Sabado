package br.com.cursojava.aula008;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoUtil {

	private static final String URL = "jdbc:postgresql://localhost:5432/curso";
	private static final String USUARIO = "postgres";
	private static final String SENHA = "admin";
	private static final String DRIVER = "org.postgresql.Driver";
	private static Connection conexao;

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Não foi possível carregar o Driver do Banco");
		}
	}
	
	public static Connection getConexao() {
		try {
			if (conexao == null || conexao.isClosed()) {
				conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			}
		} catch (SQLException e) {
			System.out.println("Falha na conexão com o banco de dados");
			e.printStackTrace();
		}
		return conexao;
	}
}