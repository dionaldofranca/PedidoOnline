package br.com.dlaine.model;
import java.util.Date;

public class Pedido {

		private int idPedido;
		private int idUsuario;
		private int status;
		private String observacao;
		private Date dataPedido;
		
	public Pedido() {
			
	}

	public Pedido(int idPedido, int idUsuario, int status, String observacao, Date dataPedido) {
	
		this.idPedido = idPedido;
		this.idUsuario = idUsuario;
		this.status = status;
		this.observacao = observacao;
		this.dataPedido = dataPedido;
	}

	public Pedido(int status, String observacao, Date dataPedido) {
		super();
		this.status = status;
		this.observacao = observacao;
		this.dataPedido = dataPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
			
}
	
