package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.conexao.AlunoDAO;
import br.edu.ifpr.trabalho.poo.conexao.CampusDAO;
import br.edu.ifpr.trabalho.poo.conexao.CursoDAO;
import br.edu.ifpr.trabalho.poo.conexao.DisciplinaDAO;
import br.edu.ifpr.trabalho.poo.conexao.MatriculaDAO;
import br.edu.ifpr.trabalho.poo.conexao.ProfessorDAO;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class BuscaImp1 implements IBuscaDeDados{

	public ArrayList<Matricula> buscarMatriculasAtivas() {
		MatriculaDAO matriculasativas = new MatriculaDAO();
		return matriculasativas.listar();
	}

	public ArrayList<Matricula> buscarTodasMatriculas() {
		MatriculaDAO matriculadao = new MatriculaDAO();
		return matriculadao.listar();
	}

	public ArrayList<Aluno> buscarAlunos() {
		AlunoDAO alunodao = new AlunoDAO();
		return alunodao.listar();
	}

	public ArrayList<Turma> buscarTurmas() {
		return null;
	
	}

	public ArrayList<Professor> buscarProfessores() {
		// TODO Auto-generated method stub
		ProfessorDAO professordao = new ProfessorDAO();
		return professordao.listar();
	}

	public ArrayList<Disciplina> buscarDisciplinas() {
		DisciplinaDAO disciplinadao = new DisciplinaDAO();
		return disciplinadao.listar();
	}

	public ArrayList<Curso> buscarCursos() {
		CursoDAO cursodao = new CursoDAO();
		return cursodao.listar();
	}

	public ArrayList<Campus> buscarCampi() {
		CampusDAO campusdao = new CampusDAO();
		return campusdao.listar();
	}

}