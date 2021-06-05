package br.ufba.poo;

public class Conta {
	private String codigo;
	private double saldo = 0;

	public Conta(String codigo) {
		this.codigo = codigo;
	}	
	
	public Conta(String codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}	
	
	public boolean retira(double quantia) {
		if(saldo-quantia >= 0) {
			saldo -= quantia;
			return true;
		}
		return false;
	}	
	
	public void deposita(double quantia) {
		saldo += quantia;
	}
	
	public boolean transfere(double quantia, Conta beneficiario) {
		if(beneficiario != null) {
			if(this.retira(quantia)) {
				beneficiario.deposita(quantia);
				return true;
			}	
		}
		return false;
	}	

	public String getCodigo() {
		return this.codigo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}	
}
