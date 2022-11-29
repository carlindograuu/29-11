package br.edu.ifpr.trabalho.poo.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Matricula;

public class MatriculaDAO {
	
	public ArrayList<Matricula> listar() {
		ArrayList<Matricula> listaDeDisciplina = new ArrayList<Matricula>();
		String SQL = "SELECT * FROM matricula.tb_disciplina";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = preparacaoDaInstrucao.executeQuery();

			while (resultado.next()) {
				Matricula matricula = transformarResult1SetEmObjeto(resultado);
				listaDeDisciplina.add(matricula);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listaDeDisciplina;
	}

	public void salvarMatricula(Matricula matricula) {
		String SQL = "INSERT INTO tb_disciplina (ra, data, situacao, turma, aluno) VALUES (?, ?, ?, ?)";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, matricula.getRa());
			preparacaoDaInstrucao.setString(2, matricula.getData());
			preparacaoDaInstrucao.setBoolean(3, matricula.getSituacao());
			preparacaoDaInstrucao.setInt(4, matricula.getTurma().getIdTurma());
			preparacaoDaInstrucao.setInt(5, matricula.getAluno().getIdAluno());

			preparacaoDaInstrucao.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// transforma��o
	public Matricula transformarResult1SetEmObjeto(ResultSet resultSet) throws SQLException {
		Matricula matricula = new Matricula();
		try {
			matricula.setIdDisciplina(resultSet.getInt("id_disciplina"));
			matricula.setRa(resultSet.getString("ra"));
			matricula.setData(resultSet.getString("data"));
			matricula.setFkTurma(resultSet.getObject("fk_turma"));
			matricula.setFkAluno(resultSet.getObject("fk_aluno"));

			return matricula;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar!");
		}
	}

}


