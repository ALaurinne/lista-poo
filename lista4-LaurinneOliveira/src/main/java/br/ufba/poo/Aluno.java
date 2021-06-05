package br.ufba.poo;

public class Aluno {
	String nome;
	private double nota;
	
	public Aluno(String nome, double nota) {
		if(nota >= 0 && nota <= 10) {
			this.nome = nome;
			this.nota = nota;
		}
		else {
			throw new NotaInvalidaException();
		}
	}
}
