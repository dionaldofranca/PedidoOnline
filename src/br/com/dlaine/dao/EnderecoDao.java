package br.com.dlaine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.dlaine.model.Endereco;

public class EnderecoDao {
	
	private Connection connection;
	private String erro;

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public EnderecoDao() {
		this.connection = new ConnectionFactory().getConnection();

	}
	
	public int insert(Endereco endereco) {
		String sql = "INSERT INTO endereco (endereco, bairro, cidade, estado, cep) VALUES ( ?, ?, ?, ?, ?)";
		int id = 0;

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, endereco.getEndereco());
			stmt.setString(2, endereco.getBairro());
			stmt.setString(3, endereco.getCidade());
			stmt.setString(4, endereco.getEstado());
			stmt.setInt(5, endereco.getCep());
			stmt.execute();

			sql = "SELECT CURRVAL ('endereco_id_seq') AS id";
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
}

