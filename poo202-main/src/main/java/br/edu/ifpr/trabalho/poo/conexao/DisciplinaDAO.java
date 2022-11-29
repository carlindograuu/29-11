package br.edu.ifpr.trabalho.poo.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Disciplina;

public class DisciplinaDAO {

	public ArrayList<Disciplina> listar() {
		ArrayList<Disciplina> listaDeDisciplina = new ArrayList<Disciplina>();
		String SQL = "SELECT * FROM matricula.tb_disciplina";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = preparacaoDaInstrucao.executeQuery();

			while (resultado.next()) {
				Disciplina disciplina = transformarResultsSetEmObjeto(resultado);
				listaDeDisciplina.add(disciplina);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listaDeDisciplina;
	}

	public void salvarDisciplina(Disciplina disciplina) {
		String SQL = "INSERT INTO tb_disciplina (nome, cargaHoraria, turma, professor) VALUES (?, ?, ?, ?)";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, disciplina.getNome());
			preparacaoDaInstrucao.setInt(2, disciplina.getCargaHoraria());
			preparacaoDaInstrucao.setInt(3, disciplina.getTurma().getIdTurma());
			preparacaoDaInstrucao.setInt(4, disciplina.getProfessor().getIdProfessor());

			preparacaoDaInstrucao.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// transforma��o
	public Disciplina transformarResultsSetEmObjeto(ResultSet resultSet) throws SQLException {
		Disciplina disciplina = new Disciplina();
		try {
			disciplina.setIdDisciplina(resultSet.getInt("id_disciplina"));
			disciplina.setNome(resultSet.getString("nome"));
			disciplina.setCargaHoraria(resultSet.getInt("cargaHoraria"));
			disciplina.setFkTurma(resultSet.getObject("fk_turma"));
			disciplina.setFkProfessor(resultSet.getObject("fk_professor"));

			return disciplina;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar!");
		}
	}

}
