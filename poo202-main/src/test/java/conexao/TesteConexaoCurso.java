package conexao;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.conexao.CursoDAO;
import br.edu.ifpr.trabalho.poo.modelo.Curso;

public class TesteConexaoCurso {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		CursoDAO cursoDAO = new CursoDAO();
		System.out.println("informe o nome do curso");
		String nome = teclado.nextLine();
		System.out.println("informe a duração do curso");
		String duracao = teclado.nextLine();
		System.out.println("informe a modalidade do curso");
		String modalidade = teclado.nextLine();
		System.out.println("informe o código do curso");
		int idCampus = teclado.nextInt();

		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setDuracao(duracao);
		curso.setModalidade(modalidade);
		curso.setIdCampus(idCampus);
		cursoDAO.salvarCurso(curso);

		ArrayList<Curso> listaCurso = cursoDAO.listar();

		for (Curso s : listaCurso) {
			System.out.println(s.getNome());
		}

		teclado.close();
	}

}
