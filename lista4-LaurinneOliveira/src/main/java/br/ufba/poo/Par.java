package br.ufba.poo;

public class Par<T> {
	private T valor1;
	private T valor2;
	
	public Par(T um, T dois){
		this.setValor1(um);
		this.setValor2(dois);
	}
	
	public T getValor1() {
		return valor1;
	}
	
	public T getValor2() {
		return valor2;
	}
	
	public void setValor1(T valor1) {
		this.valor1 = valor1;
	}

	public void setValor2(T valor2) {
		this.valor2 = valor2;
	}
	
	public void combina (Combinador<T> combinador) {
		this.valor1 = combinador.combina(this);
	}

}
