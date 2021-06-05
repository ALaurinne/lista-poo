package br.ufba.poo;

public class Aluno {
	private String matricula;
	private String nome;
	
	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
		
	 @Override
	  public boolean equals(Object obj) {
	    if (!(obj instanceof Aluno)) return false;
	    
	    Aluno aluno = (Aluno) obj;
	    
	    if (this.matricula.equals(aluno.matricula)) return true;
	    
	    return false;
	  }

	 @Override
	 public int hashCode() {
			return Integer.parseInt(getMatricula());
		}

}
