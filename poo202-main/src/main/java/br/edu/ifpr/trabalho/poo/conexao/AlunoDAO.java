package br.edu.ifpr.trabalho.poo.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Aluno;

public class AlunoDAO {

	public ArrayList<Aluno> listar() {
		ArrayList<Aluno> listaParaRetorno = new ArrayList<Aluno>();
		String SQL = "SELECT * FROM matricula.tb_aluno";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = preparacaoDaInstrucao.executeQuery();

			while (resultado.next()) {
				Aluno aluno = transformaResultadoSetemObjeto(resultado);
				listaParaRetorno.add(aluno);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}

		return listaParaRetorno;

	}

	public void salvarAluno(Aluno aluno) {
		String SQL = "INSERT INTO tb_aluno (nome, cpf, telefone, endereco, data_nascimento, ano_ingresso) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, aluno.getNome());
			preparacaoDaInstrucao.setString(2, aluno.getCpf());
			preparacaoDaInstrucao.setString(3, aluno.getTelefone());
			preparacaoDaInstrucao.setString(4, aluno.getEndereco());
			preparacaoDaInstrucao.setString(5, aluno.getDataNascimento());
			preparacaoDaInstrucao.setInt(6, aluno.getAnoIngresso());


			preparacaoDaInstrucao.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Aluno transformaResultadoSetemObjeto(ResultSet resultSet) throws SQLException {
		Aluno aluno = new Aluno();
		try {
			aluno.setIdAluno(resultSet.getInt("id_pessoa"));
			aluno.setNome(resultSet.getString("nome"));
			aluno.setCpf(resultSet.getString("cpf"));
			aluno.setTelefone(resultSet.getString("telefone"));
			aluno.setEndereco(resultSet.getString("endereco"));
			aluno.setDataNascimento(resultSet.getString("data_nascimento"));
			aluno.setAnoIngresso(resultSet.getInt("ano_ingresso"));


			return aluno;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar!");
		}
	}

}
