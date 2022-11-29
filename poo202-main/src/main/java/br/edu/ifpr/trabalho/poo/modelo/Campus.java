package br.edu.ifpr.trabalho.poo.modelo;

public class Campus {
	
	private int IdCampus;
	private String nome;
	private String endereco;
	private String cidade;
	
	public Campus() {
		
	}
	
	public Campus(String nome, String endereco, String cidade) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getIdCampus() {
		return IdCampus;
	}

	public void setIdCampus(int idCampus) {
		IdCampus = idCampus;
	}

	public void imprimirDados() {
		System.out.println("nome:" + this.getNome());
		
	}

}
