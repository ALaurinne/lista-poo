package br.ufba.poo;

enum Situacao {
	PENDENTE,
	EM_ENTREGA,
	FINALIZADO
}

public class Pedido {
	private double valor;
	private Situacao situacao;
	
	public Pedido(double valor) {
		this.valor = valor;
		this.situacao = Situacao.PENDENTE;
	}
	
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public Situacao getSituacao() {
		return this.situacao;
	}
}
