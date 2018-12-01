package br.com.cursojava.aula008;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositorio de contatos, responsável por realizar a transforamação dos dados
 * entre o paradigma do banco de dados e a aplicação(O.O)
 * 
 * @author Raphael
 *
 */
public class RepositorioContato {

	public void inserir(Contato contato) {
		String sql = "insert into Contatos(nome, email, telefone) values(?, ?, ?)";

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());

			comando.execute();
			ResultSet keys = comando.getGeneratedKeys();
			if (keys.next()) {
				contato.setId(keys.getInt(1));
			}
			keys.close();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível inserir o registro no banco: " + contato);
		}
	}

	public void atualizar(Contato contato) {
		String sql = "update Contatos set nome = ?, email = ?, telefone = ? where (id = ?)";

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());
			comando.setInt(4, contato.getId());

			comando.executeUpdate();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível atualizar o registro no banco: " + contato);
		}
	}

	public void remover(Integer id) {
		String sql = "delete from Contatos where (id = ?)";

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			comando.execute();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível remover o registro do banco:" + id);
		}
	}
	
	public long contar() {
		String sql = "select count(*) as total from Contatos";
		long total = 0;

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				total = cursor.getLong("total");
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível buscar o total de registros");
		}
		return total;
	}

	public List<Contato> buscarTodos() {
		List<Contato> lista = new ArrayList<Contato>();

		String sql = "select * from Contatos";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Contato contato = null;

			while (cursor.next()) {
				contato = criarContato(cursor);
				lista.add(contato);
			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível buscar a lista de registros");
		}

		return lista;
	}

	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		String sql = "select * from Contatos where (id = ?)";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			ResultSet cursor = comando.executeQuery();

			if (cursor.next()) {
				contato = criarContato(cursor);
			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível buscar a lista de registros");
		}

		return contato;
	}

	private Contato criarContato(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");
		return new Contato(id, nome, email, telefone);
	}

}