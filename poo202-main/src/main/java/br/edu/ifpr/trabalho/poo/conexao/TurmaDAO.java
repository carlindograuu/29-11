package br.edu.ifpr.trabalho.poo.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class TurmaDAO {

	public ArrayList<Turma> listar() {
		ArrayList<Turma> listaDeCampus = new ArrayList<Turma>();
		String SQL = "SELECT * FROM matricula.tb_campus";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = preparacaoDaInstrucao.executeQuery();

			while (resultado.next()) {
				Turma turma = transformarResultSetEmObjeto(resultado);
				listaDeCampus.add(turma);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listaDeCampus;
	}

	public void salvarTurma(Turma turma) {
		String SQL = "INSERT INTO tb_campus (nome, numeroMinimo, anoIngresso, curso) VALUES (?, ?, ?, ?)";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, turma.getNome());
			preparacaoDaInstrucao.setInt(2, turma.getNumeroMinimo());
			preparacaoDaInstrucao.setInt(3, turma.getAnoIngresso());
			preparacaoDaInstrucao.setInt(4, turma.getCurso().getIdCurso());

			preparacaoDaInstrucao.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// transforma��o
	public Turma transformarResultSetEmObjeto(ResultSet resultSet) throws SQLException {
		Turma turma = new Turma();
		try {
			turma.setIdCampus(resultSet.getInt("id_campus"));
			turma.setNome(resultSet.getString("nome"));
			turma.setEndereco(resultSet.getString("endereco"));
			turma.setCidade(resultSet.getString("cidade"));
			return turma;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar!");
		}
	}

}
