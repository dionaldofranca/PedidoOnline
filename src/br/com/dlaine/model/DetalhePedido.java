package br.com.dlaine.model;

public class DetalhePedido {
	
	private int idDetalhe;
	private int idPedido;
	private int IdProduto;
	private int quantidade;
	
	public DetalhePedido() {
		
	}

	public DetalhePedido(int idDetalhe, int idPedido, int idProduto, int quantidade) {
		
		this.idDetalhe = idDetalhe;
		this.idPedido = idPedido;
		IdProduto = idProduto;
		this.quantidade = quantidade;
	}

	public DetalhePedido(int quantidade) {
	
		this.quantidade = quantidade;
	}

	public int getIdDetalhe() {
		return idDetalhe;
	}

	public void setIdDetalhe(int idDetalhe) {
		this.idDetalhe = idDetalhe;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdProduto() {
		return IdProduto;
	}

	public void setIdProduto(int idProduto) {
		IdProduto = idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
	
}
