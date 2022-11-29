package br.edu.ifpr.trabalho.poo.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;

public class CursoDAO {

	public ArrayList<Curso> listar() {
		ArrayList<Curso> listaDeCursos = new ArrayList<Curso>();
		String SQL = "SELECT * FROM matricula.tb_curso";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = preparacaoDaInstrucao.executeQuery();

			while (resultado.next()) {
				Curso curso = transformarResultadoSetEmObjeto(resultado);
				listaDeCursos.add(curso);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listaDeCursos;
	}

	public void salvarCurso(Curso curso) {
		String SQL = "INSERT INTO tb_curso (nome, duracao, modalidade, campus) VALUES (?, ?, ?, ?)";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, curso.getNome());
			preparacaoDaInstrucao.setString(2, curso.getDuracao());
			preparacaoDaInstrucao.setString(3, curso.getModalidade());
			preparacaoDaInstrucao.setInt(4, curso.getCampus().getIdCampus());

			preparacaoDaInstrucao.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// transforma��o
	public Curso transformarResultadoSetEmObjeto(ResultSet resultSet) throws SQLException {
		Curso curso = new Curso();
		try {
			curso.setIdCurso(resultSet.getInt("id_curso"));
			curso.setNome(resultSet.getString("nome"));
			curso.setModalidade(resultSet.getString("duracao"));
			curso.setModalidade(resultSet.getString("modalidade"));
			Campus campus = new Campus();
			curso.setIdCampus(resultSet.getInt("fk_campus"));
			curso.setCampus(campus);

			return curso;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar!");
		}
	}

}
