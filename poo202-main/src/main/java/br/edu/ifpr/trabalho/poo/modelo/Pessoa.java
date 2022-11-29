package br.edu.ifpr.trabalho.poo.modelo;

public abstract class Pessoa {
	
	private int idPessoa;
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected String endereco;
	protected String dataNascimento;
	
	public abstract void imprimirDados();

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	
}
