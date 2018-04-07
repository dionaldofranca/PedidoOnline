package br.com.dlaine.model;

public class Produto {
	
	private int idProduto;
	private String referencia;
	private String nome;
	private float precoCusto;
	private float precoVenda;
	private String fotoProduto;
	private int tipoProduto;
	
	public Produto() {
		
	}

	public Produto(int idProduto, String referencia, String nome, float precoCusto, float precoVenda, String fotoProduto, int tipoProduto) {
		
		this.idProduto = idProduto;
		this.referencia = referencia;
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.fotoProduto = fotoProduto;
		this.tipoProduto = tipoProduto;
	}

	public Produto(String referencia, String nome, float precoCusto, float precoVenda, String fotoProduto, int tipoProduto) {
		this.referencia = referencia;
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.fotoProduto = fotoProduto;
		this.tipoProduto = tipoProduto;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getFotoProduto() {
		return fotoProduto;
	}

	public void setFotoProduto(String fotoProduto) {
		this.fotoProduto = fotoProduto;
	}

	public int getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
