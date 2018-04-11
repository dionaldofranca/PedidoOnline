package br.com.dlaine.model;

public class Usuario {

	private int idUsuario;
	private String login;
	private String senha;
	private String nome;
	private String cpfcnpj;
	private String telefone;
	private String celular;
	private int tipousuario;
	private String email;

	public Usuario() {

	}

	public Usuario(int idUsuario, String login, String senha, String nome, String cpfcnpj,
			String telefone, String celular, int tipousuario, String email) {

		this.idUsuario = idUsuario;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpfcnpj = cpfcnpj;
		this.telefone = telefone;
		this.celular = celular;
		this.tipousuario = tipousuario;
		this.email = email;
	}

	public Usuario(String login, String senha, String nome, String cpfcnpj, String telefone,
			String celular, int tipousuario, String email) {

		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpfcnpj = cpfcnpj;
		this.telefone = telefone;
		this.celular = celular;
		this.tipousuario = tipousuario;
		this.email = email;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(int tipousuario) {
		this.tipousuario = tipousuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
