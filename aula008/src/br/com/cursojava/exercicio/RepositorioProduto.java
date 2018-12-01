package br.com.cursojava.exercicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.aula008.BancoUtil;

/**
 * Repositorio de pessoas, responsável por realizar a transforamação dos dados
 * entre o paradigma do banco de dados e a aplicação(O.O)
 * 
 * @author Raphael
 *
 */
public class RepositorioProduto {
	// busca por faixa de preço

	public static void inserir(Produto produto) {
		String sql = "insert into produtos(nome, descricao, preco) values(?, ?, ?)";

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setFloat(3, produto.getPreco());

			comando.execute();
			ResultSet keys = comando.getGeneratedKeys();
			if (keys.next()) {
				produto.setId(keys.getInt(1));
			}
			keys.close();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível inserir o registro no banco: " + produto);
		}
	}

	public static void alterar(Produto produto) {
		String sql = "update produtos set nome = ?, descricao = ?, preco = ? where (id = ?)";

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setFloat(3, produto.getPreco());
			comando.setInt(4, produto.getId());

			comando.executeUpdate();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível atualizar o registro no banco: " + produto);
		}
	}

	public static void remover(Integer id) {
		String sql = "delete from produtos where (id = ?)";

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			comando.execute();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível remover o registro no banco: " + id);
		}
	}

	public static long contar() {
		String sql = "select count(*) as total from produtos";
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

	private static Produto criarProduto(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String descricao = cursor.getString("descricao");
		float preco = cursor.getFloat("preco");
		return new Produto(id, nome, descricao, preco);
	}
	
	public static Produto buscarPorId(Integer id) {
		String sql = "select * from produtos where (id = ?)";
		Produto produto = null;

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				produto = criarProduto(cursor);
			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível buscar o total de registros");
		}
		return produto;
	}

	public static List<Produto> buscarTodos() {
		String sql = "select * from produtos";
		List<Produto> lista = new ArrayList<Produto>();

		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				lista.add(criarProduto(cursor));
			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível buscar a lista de todos os registros");
		}
		return lista;
	}
	
	public static List<Produto> buscarPorPreco(float min, float max) {
		String sql = "select * from produtos where (preco between ? and ?)";
		List<Produto> lista = new ArrayList<Produto>();
		
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setFloat(1, min);
			comando.setFloat(2, max);
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				lista.add(criarProduto(cursor));
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
}