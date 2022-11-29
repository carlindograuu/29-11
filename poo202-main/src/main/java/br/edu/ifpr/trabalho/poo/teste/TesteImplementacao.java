package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.BuscaImp1;
import br.edu.ifpr.trabalho.poo.implementacao.InserirImp1;
import br.edu.ifpr.trabalho.poo.implementacao.LeituraImp1;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class TesteImplementacao {

	public static void main(String[] args) {
		
		ILeituraDeDados leitura = new LeituraImp1();		
		IBuscaDeDados busca = new BuscaImp1();
		IInserirDados insercao = new InserirImp1();
		
		Campus campus = leitura.lerDadosCampus();
		insercao.salvarCampus(campus);
		ArrayList<Campus> listaCampus = busca.buscarCampi();
		for (Campus c : listaCampus) {
		c.imprimirDados();
		}


	}

}
