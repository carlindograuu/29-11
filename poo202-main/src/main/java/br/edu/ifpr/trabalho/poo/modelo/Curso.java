package br.edu.ifpr.trabalho.poo.modelo;

public class Curso {

	private String nome;
	private String duracao;
	private String modalidade;
	private Campus campus;

	public Curso() {

	}

	public Curso(String nome, String duracao, String modalidade, Campus campus) {
		this.nome = nome;
		this.duracao = duracao;
		this.modalidade = modalidade;
		this.campus = campus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}


	public void setFkCampus(Object object) {
		// TODO Auto-generated method stub

	}

	public int getIdCurso() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setIdCampus(int idCampus) {
		

	}

	public void setIdCurso(int int1) {
		// TODO Auto-generated method stub
		
	}


}
