package br.edu.ifpr.trabalho.poo.implementacao;

import br.edu.ifpr.trabalho.poo.conexao.AlunoDAO;
import br.edu.ifpr.trabalho.poo.conexao.CampusDAO;
import br.edu.ifpr.trabalho.poo.conexao.CursoDAO;
import br.edu.ifpr.trabalho.poo.conexao.DisciplinaDAO;
import br.edu.ifpr.trabalho.poo.conexao.MatriculaDAO;
import br.edu.ifpr.trabalho.poo.conexao.ProfessorDAO;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class InserirImp1 implements IInserirDados {

	public void salvarAluno(Aluno aluno) {
		AlunoDAO alunodao = new AlunoDAO();
		alunodao.salvarAluno(aluno);		
	}

	public void salvarProfessor(Professor professor) {
		ProfessorDAO professordao = new ProfessorDAO();
		professordao.salvarProfessor(professor);
	}

	public void salvarCurso(Curso curso) {
		CursoDAO cursodao = new CursoDAO();
		cursodao.salvarCurso(curso);
		
	}

	public void salvarTurma(Turma turma) {
		// TODO Auto-generated method stub
		
	}

	public void salvarDisciplina(Disciplina disciplina) {
		DisciplinaDAO disciplinadao = new DisciplinaDAO();
		disciplinadao.salvarDisciplina(disciplina);		
		
	}

	public void salvarMatricula(Matricula matricula) {
		MatriculaDAO matriculadao = new MatriculaDAO();
		matriculadao.salvarMatricula(matricula);
	}

	public void salvarCampus(Campus campus) {
		
		CampusDAO campusdao = new CampusDAO();
		campusdao.salvarCampus(campus);
		
	}

}
