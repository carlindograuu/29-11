package conexao;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.conexao.CampusDAO;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class TesteConexaoCampus {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		CampusDAO campusDAO = new CampusDAO();
		System.out.println("informe o nome do campus");
		String nome = teclado.nextLine();
		System.out.println("informe o Endereço do campus");
		String endereco = teclado.nextLine();
		System.out.println("informe a cidade do campus");
		String cidade = teclado.nextLine();

		Campus campus = new Campus();
		campus.setNome(nome);
		campus.setEndereco(endereco);
		campus.setCidade(cidade);

		campusDAO.salvarCampus(campus);

		ArrayList<Campus> listaCampus = campusDAO.listar();

		for (Campus c : listaCampus) {
			System.out.println(c.getNome());
		}

		teclado.close();
	}

}
