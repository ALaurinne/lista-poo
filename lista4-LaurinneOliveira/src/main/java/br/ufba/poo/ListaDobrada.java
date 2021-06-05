package br.ufba.poo;

import java.util.ArrayList;

public class ListaDobrada<T> {
	ArrayList<T> lista = new ArrayList<>();
	
	public int obtemTamanho() {
		return lista.size();
	}
	
	public void insereElemento(T valor) {
		lista.add(valor);
		lista.add(valor);
	}
	
	public T obtemElemento(int i){
		if (lista.isEmpty()) return null;
		
		if(i >= this.obtemTamanho() || i < 0) {
			return null;
		}
		
		return lista.get(i);
	}
	
}
