package br.ufba.poo;

public class Contador {
	private static int contagem = 0;
	
	public Contador() {
		Contador.contagem++;
	}

	public static int getContagem() {
		return contagem;
	}
	
}
