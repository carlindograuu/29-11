package br.edu.ifpr.trabalho.poo.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Professor;

public class ProfessorDAO {

	public ArrayList<Professor> listar() {
		ArrayList<Professor> listaParaRetorno = new ArrayList<Professor>();
		String SQL = "SELECT * FROM matricula.tb_professor";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = preparacaoDaInstrucao.executeQuery();

			while (resultado.next()) {
				Professor professor = transformaResultiadoSetemObjeto(resultado);
				listaParaRetorno.add(professor);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}

		return listaParaRetorno;

	}

	public void salvarProfessor(Professor professor) {
		String SQL = "INSERT INTO tb_campus (nome, cpf, telefone, endereco, dataNascimento, siape) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, professor.getNome());
			preparacaoDaInstrucao.setString(2, professor.getCpf());
			preparacaoDaInstrucao.setString(3, professor.getTelefone());
			preparacaoDaInstrucao.setString(4, professor.getEndereco());
			preparacaoDaInstrucao.setString(5, professor.getDataNascimento());
			preparacaoDaInstrucao.setString(6, professor.getSiape());


			preparacaoDaInstrucao.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Professor transformaResultiadoSetemObjeto(ResultSet resultSet) throws SQLException {
		Professor professor = new Professor();
		try {
			professor.setIdProfessor(resultSet.getInt("id_professor"));
			professor.setNome(resultSet.getString("nome"));
			professor.setCpf(resultSet.getString("cpf"));
			professor.setTelefone(resultSet.getString("telefone"));
			professor.setEndereco(resultSet.getString("endereco"));
			professor.setDataNascimento(resultSet.getString("dataNascimento"));
			professor.setSiape(resultSet.getInt("siape"));


			return professor;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar!");
		}
	}

}
