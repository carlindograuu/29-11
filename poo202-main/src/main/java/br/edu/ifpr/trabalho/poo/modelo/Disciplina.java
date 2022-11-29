package br.edu.ifpr.trabalho.poo.modelo;

public class Disciplina {
	
	private String nome;
	private int cargaHoraria;
	private Turma turma;
	private Professor professor;
	
	public Disciplina(String nome, int cargaHoraria, Turma turma, Professor professor) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.turma = turma;
		this.professor = professor;

	}

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public void setIdDisciplina(int int1) {
		// TODO Auto-generated method stub
		
	}

	public void setFkTurma(Object object) {
		// TODO Auto-generated method stub
		
	}

	public void setFkProfessor(Object object) {
		// TODO Auto-generated method stub
		
	}
	
	

}
