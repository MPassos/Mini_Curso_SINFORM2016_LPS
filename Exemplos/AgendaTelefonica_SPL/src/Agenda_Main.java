import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * TODO description
 */
public class Agenda_Main {

	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);
		Agenda ag = new Agenda();
		Arquivo a = new Arquivo(new File("contatos.txt"),ag);
		a.carregarAgenda();
		Contato aux;
		int op = -1;
		do {
			System.out.println("*************************\nAGENDA TELEFONICA\n*************************");
			System.out.println("1 - ADCIONAR");
			
			//#if Alterar
			System.out.println("2 - ALTERAR");
			//#endif
			
			//#if Excluir
			System.out.println("3 - EXCLUIR");
			//#endif
			
			//#if Pesquisa
			System.out.println("4 - PESQUISAR");
			//#endif
			
			System.out.println("5 - VER AGENDA");
			
			//#if Importar
			System.out.println("6 - IMPORTAR AGENDA");
			//#endif
			
			//#if Exportar
			System.out.println("7 - EXPORTAR AGENDA");
			//#endif
			
			//#if Sobre
			System.out.println("8 - SOBRE");
			//#endif
			
			System.out.println("0 - SAIR");
			System.out.print("Sua opcao:");
			op = teclado.nextInt();

			switch (op) {
			case 1:
				aux = new Contato();
				System.out.print("Digite um nome:");
				aux.setNome(teclado.next());
				System.out.print("Digite um sobrenome:");
				aux.setSobrenome(teclado.next());
				System.out.print("Digite um DDD:");
				aux.setDdd(teclado.next());
				System.out.print("Digite um telefone:");
				aux.setNumero(teclado.next());
				ag.adcionaContato(aux);
				break;
			//#if Alterar
			case 2:
				aux = new Contato();
				System.out.print("Digite um nome para pesquisa:");
				aux.setNome(teclado.next());
				ag.alteraContato(aux);
				break;
			//#endif
				
			//#if Excluir
			case 3:
				aux = new Contato();
				System.out.print("Digite um nome para pesquisa:");
				aux.setNome(teclado.next());
				ag.excluiContato(aux);
				break;
			//#endif
				
			//#if Pesquisa	
			case 4:
				aux = new Contato();
				System.out.print("Digite um nome para pesquisa:");
				aux.setNome(teclado.next());
				ag.pesquisaContato(aux);
				break;
			//#endif
				
			case 5:
				ag.visualizaAgenda();
				break;
				
			//#if Importar
			case 6:
				System.out.print("Informe o caminho do arquivo a ser importado!");
				a.importarAgenda(teclado.next());
				break;
			//#endif
			
			//#if Exportar
			case 7:
				System.out.print("Informe o nome do arquivo para ser exportado!");
				a.exportarAgenda(teclado.next());
				break;
			//#endif
				
			//#if Sobre
			case 8:
				System.out.println("LPS Agenda Telefonica\nMINICURSO SINFORM 2016\n");
				break;	
			//#endif
			case 0:
				System.out.println("Encerrando");
				a.gravarAgenda();
				teclado.close();
				break;
			default:
				System.out.println("Opcao Invalida!");
			}
		} while (op != 0);
	}

}
