package br.edu.ifpr.trabalho.poo.modelo;

public final class Aluno extends Pessoa {

	private int anoIngresso;

	public Aluno(String nome, String cpf, String telefone, String endereco, String dataNascimento, int anoIngresso) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.anoIngresso = anoIngresso;

	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public void imprimirDados() {
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	public String getCpf() {
		return cpf;

	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setIdAluno(int int1) {
		// TODO Auto-generated method stub

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdAluno() {
		return 0;
	}

}
