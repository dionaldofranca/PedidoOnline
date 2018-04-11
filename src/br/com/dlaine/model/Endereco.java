package br.com.dlaine.model;

public class Endereco {
	
	  private int idEndereco;
	  private int idUsuario;
	  private String endereco;
	  private String bairro;
	  private String cidade;
	  private String estado;
	  private int cep;
	
	  public Endereco() {

	}

	public Endereco(int idEndereco, int idUsuario, String endereco, String bairro, String cidade, String estado, int cep) {

		this.idEndereco = idEndereco;
		this.idUsuario = idUsuario;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	public Endereco(int idUsuario, String endereco, String bairro, String cidade, String estado, int cep) {
		
		this.idUsuario = idUsuario;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco(String endereco, String bairro, String cidade, String estado, int cep) {
		
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	  
}
