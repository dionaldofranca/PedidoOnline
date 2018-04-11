package br.com.dlaine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.dlaine.dao.ConnectionFactory;
import br.com.dlaine.model.Usuario;

public class UsuarioDao {

	private Connection connection;
	private String erro;

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public UsuarioDao() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public int insert(Usuario usuario) {
		String sql = "INSERT INTO usuario (login, senha, nome, cpfcnpj, telefone, celular, tipousuario, email) VALUES (? , MD5(?), ?, ?, ?, ?, ?, ?)";
		int id = 0;

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getNome());
			stmt.setString(4, usuario.getCpfcnpj());
			stmt.setString(5, usuario.getTelefone());
			stmt.setString(6, usuario.getCelular());
			stmt.setInt(7, usuario.getTipousuario());
			stmt.setString(8, usuario.getEmail());
			stmt.execute();

			sql = "SELECT CURRVAL ('usuario_id_seq') AS id";
			stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			if (rs.next() == true) {
				id = rs.getInt("id");
			}

			return id;

		} catch (SQLException e) {

			this.setErro(e.getMessage());
		}
		return 0;
	}

	public Usuario autenticaUsuario(Usuario usuario) {

		String sql = "SELECT * FROM usuario WHERE login = ? and senha = MD5(?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
			//Usuario usuario = new Usuario(rs.getInt("id"),

				//	rs.getString("nome"), rs.getString("login");

			// Retorna Usuario Autenticado
			return usuario;
		} else {
			// Retorna Usuario Nulo
			return null;
		}
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
}


/*
 * public int delete(int id) { String sql = "DELETE FROM usuario WHERE id = ?";
 * 
 * try { PreparedStatement stmt = connection.prepareStatement(sql);
 * stmt.setInt(1, id);
 * 
 * return stmt.executeUpdate();
 * 
 * } catch (Exception e) { this.setErro(e.getMessage()); } return 0; }
 * 
 * public int update(Usuario usuario) { String sql =
 * "UPDATE usuario set nome=?, login=? WHERE id=? ";
 * 
 * try { PreparedStatement stmt = connection.prepareStatement(sql);
 * stmt.setString(1, usuario.getNome()); stmt.setString(2, usuario.getLogin());
 * stmt.setInt(3, usuario.getId());
 * 
 * return stmt.executeUpdate();
 * 
 * } catch (Exception e) { this.setErro(e.getMessage()); } return 0; }
 * 
 * public Usuario getUsuario(int id) { String sql =
 * "SELECT * FROM usuario WHERE id = ? ";
 * 
 * try { PreparedStatement stmt = connection.prepareStatement(sql);
 * stmt.setInt(1, id);
 * 
 * ResultSet rs = stmt.executeQuery();
 * 
 * if (rs.next() == true) { Usuario usuario = new Usuario(rs.getInt("id"),
 * rs.getString("nome"), rs.getString("login"), rs.getString("senha"),
 * rs.getString("path_foto"), rs.getString("email")); return usuario; } else {
 * return null; }
 * 
 * } catch (Exception e) { this.setErro(e.getMessage()); } return null; }
 * 
 * public List<Usuario> getListaUsuarios(int linhas, int pagina) { String sql =
 * "SELECT * FROM usuario ORDER BY id LIMIT ? OFFSET ?"; List<Usuario>
 * listaUsuarios = new ArrayList<Usuario>(); try { PreparedStatement stmt =
 * connection.prepareStatement(sql); stmt.setInt(1, linhas); stmt.setInt(2,
 * (linhas * pagina) - linhas); ResultSet rs = stmt.executeQuery(); while
 * (rs.next() == true) { Usuario usuario = new Usuario(rs.getInt("id"),
 * rs.getString("nome"), rs.getString("login"), rs.getString("senha"),
 * rs.getString("path_foto"), rs.getString("email"));
 * listaUsuarios.add(usuario); } return listaUsuarios; } catch (SQLException e)
 * { // throw new RuntimeException(e); this.setErro(e.getMessage()); } return
 * null; }
 * 
 * public int gravaFoto(int id, String pathFoto) { String sql =
 * "UPDATE usuario SET path_foto=? WHERE id =?"; try { // prepared statement
 * para inserção PreparedStatement stmt = connection.prepareStatement(sql); //
 * seta os valores stmt.setString(1, pathFoto); stmt.setInt(2, id); // executa
 * return stmt.executeUpdate(); } catch (SQLException e) { throw new
 * RuntimeException(e); } }
 * 
 * public int totalUsuarios() { String sql =
 * "SELECT COUNT(1) as totalUsuarios FROM usuario"; int totalUsuarios = 0; try {
 * PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs =
 * stmt.executeQuery(); if (rs.next()) { totalUsuarios =
 * rs.getInt("totalUsuarios"); } return totalUsuarios; } catch (SQLException e)
 * { throw new RuntimeException(e); } }
 * 
 * public boolean verificarEmail(String emailSolicitado) {
 * 
 * String sql = "SELECT * FROM usuario WHERE email = ?";
 * 
 * try { PreparedStatement stmt = connection.prepareStatement(sql);
 * 
 * stmt.setString(1, emailSolicitado); ResultSet rs = stmt.executeQuery(); if
 * (rs.next()) { return true; } return false; } catch (SQLException e) { throw
 * new RuntimeException(e); } }
 * 
 * public String gerarSenha() {
 * 
 * String senha = "";
 * 
 * String[] carct = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a",
 * "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
 * "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E",
 * "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
 * "U", "V", "W", "X", "Y", "Z" };
 * 
 * for (int x = 1; x <= 6; x++) { int j = (int) (Math.random() * carct.length);
 * senha += carct[j]; } return senha; }
 * 
 * public String inserirSenha(String senha, String emailSolicitado) {
 * 
 * String sql = "UPDATE usuario set senha = MD5(?) WHERE email= ? ";
 * 
 * try { PreparedStatement stmt = connection.prepareStatement(sql);
 * stmt.setString(1, senha); stmt.setString(2, emailSolicitado);
 * stmt.executeUpdate();
 * 
 * } catch (Exception e) { this.setErro(e.getMessage()); } return null;
 * 
 * } }
 */
