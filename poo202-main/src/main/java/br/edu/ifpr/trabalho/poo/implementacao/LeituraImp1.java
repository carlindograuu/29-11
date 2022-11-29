package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class LeituraImp1 implements ILeituraDeDados {

	public Aluno lerDadosAluno() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do aluno:");
		String nome = teclado.nextLine();
		System.out.println("Informe o cpf");
		String cpf = teclado.nextLine();
		System.out.println("Informe o telefone");
		String telefone = teclado.nextLine();
		System.out.println("Informe o endereço");
		String endereco = teclado.nextLine();
		System.out.println("Informe a data de nascimento");
		String dataNascimento = teclado.nextLine();
		System.out.println("Informe o ano de ingresso:");
		int anoIngresso = teclado.nextInt();
		Aluno aluno = new Aluno(nome, cpf, telefone, endereco, dataNascimento, anoIngresso);

		return aluno;

	}

	public Professor lerDadosProfessor() {
		// TODO Auto-generated method stub
		return null;
	}

	public Curso lerDadosCurso() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do curso:");
		String nome = teclado.nextLine();
		System.out.println("Informe a duração do curso");
		String duracao = teclado.nextLine();
		System.out.println("Informe a modalidade");
		String modalidade = teclado.nextLine();
		System.out.println("Informe o código do campus");
		int idCampus = teclado.nextInt();
		Campus campus = new Campus();
		campus.setIdCampus(idCampus);
		Curso curso = new Curso(nome, duracao, modalidade, campus);

		return curso;
	}

	public Turma lerDadosTurma() {
		// TODO Auto-generated method stub
		return null;
	}

	public Turma lerDadosTurma(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome da disciplina:");
		String nome = teclado.nextLine();
		System.out.println("Informe a carga horária da disciplina");
		int cargaHoraria = teclado.nextInt();
		System.out.println("Informe o código da turma");
		int idTurma = teclado.nextInt();
		Turma turma1 = new Turma();
		turma1.setIdTurma(idTurma);
		System.out.println("Informe o código do professor");
		int idProfessor = teclado.nextInt();
		Professor professor1 = new Professor();
		professor1.setIdProfessor(idProfessor);
		Disciplina disciplina = new Disciplina(nome, cargaHoraria, turma1, professor1);

		return disciplina;
	}

	public Matricula lerDadosMatricula() {
		return null;

	}

	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o ra :");
		String ra = teclado.nextLine();
		System.out.println("Informe a data da matricula");
		String data = teclado.nextLine();
		System.out.println("informe a situacao da matricula");
		boolean situacao = teclado.nextBoolean();
		System.out.println("Informe o c�digo da turma");
		int idTurma = teclado.nextInt();
		Turma turma1 = new Turma();
		turma1.setIdTurma(idTurma);
		System.out.println("Informe o c�digo do aluno");
		int idAluno = teclado.nextInt();
		Aluno aluno1 = new Aluno();
		aluno.setIdAluno(idAluno);
		Matricula matricula = new Matricula(ra, data, situacao, turma1, aluno1);

		return matricula;
	}

	public Campus lerDadosCampus() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do campus:");
		String nome = teclado.nextLine();
		System.out.println("Informe o endere�o do campus:");
		String endereco = teclado.nextLine();
		System.out.println("Informe a cidade do campus:");
		String cidade = teclado.nextLine();
		Campus campus = new Campus(nome, endereco, cidade);

		teclado.close();

		return campus;

	}
}
