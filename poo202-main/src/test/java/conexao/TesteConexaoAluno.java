package conexao;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.conexao.AlunoDAO;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;

public class TesteConexaoAluno {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	AlunoDAO alunoDAO = new AlunoDAO();
	System.out.println("Informe o nome do aluno:");
	String nome = teclado.nextLine();
	System.out.println("Informe o CPF:");
	String cpf = teclado.nextLine();
	System.out.println("Informe o telefone");
	String telefone = teclado.nextLine();
	System.out.println("Informe o endereço");
	String endereco = teclado.nextLine();
	System.out.println("Informe a data de nascimento");
	String dataNascimento = teclado.nextLine();
	System.out.println("Informe o ano de ingresso:");
	int anoIngresso = teclado.nextInt();

	
	Aluno aluno = new Aluno();
	aluno.setNome(nome);
	aluno.setCpf(cpf);
	aluno.setTelefone(telefone);
	aluno.setEndereco(endereco);
	aluno.setDataNascimento(dataNascimento);
	aluno.setAnoIngresso(anoIngresso);
	
	alunoDAO.salvarAluno(aluno);
	

	ArrayList<Aluno> listaAluno = alunoDAO.listar();

	for (Aluno a : listaAluno) {
		System.out.println(a.getNome());
	}


	
	teclado.close();

	}
}
