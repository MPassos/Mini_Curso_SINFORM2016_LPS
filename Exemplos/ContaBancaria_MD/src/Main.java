import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		char op;
		Conta c1, c2;
		c1 = new Conta();
		c2 = new Conta();

		do {
			System.out.println("**********************\nLPS CONTA BANCARIA\n**********************");
			System.out.println("C - Criar conta");
			System.out.println("V - Ver Saldo");
			System.out.println("D - Deposito");
			System.out.println("R - Saque");
			// #if Ver_Limite
			System.out.println("L - Ver limite");
			// #endif
			//#if Definir_Limite
			System.out.println("M - Definir Limite");
			//#endif
			// #if Transferencia
			System.out.println("T - Transferencia");
			// #endif
			//#if Ver_Dados
			System.out.println("J - Ver dados da conta");
			//#endif
			System.out.println("S - Sair");
			System.out.print("SUA OPCAO:");
			op = teclado.next().charAt(0);

			switch (op) {
			case 'C':
				System.out.print("Insira o nome do titular: ");
				c1.setTitular(teclado.next());
				System.out.print("Insira o numero da conta: ");
				c1.setNum_conta(teclado.nextInt());
				System.out.print("Insira o saldo da conta:");
				c1.setSaldo(teclado.nextFloat());
				//#if Ver_Limite || Definir_Limite
				System.out.print("Insira o limite da conta:");
				c1.setLimite(teclado.nextFloat());
				// #endif
				break;
			case 'V':
				System.out.println("Saldo:" + c1.getSaldo());
				break;
			case 'D':
				System.out.print("Insira o valor do dep?sito");
				c1.deposito(teclado.nextFloat());
				break;
			case 'R':
				System.out.print("Insira o valor do saque");
				c1.saque(teclado.nextFloat());
				break;
			// #if Ver_Limite
			case 'L':
				System.out.println("Limite:" + c1.getLimite());
				break;
			// #endif
			//#if Definir_Limite
			case 'M':
				System.out.print("Insira o novo valor do limite");
				c1.setLimite(teclado.nextFloat());
			//#endif
			// #if Transferencia
			case 'T':
				System.out.print("Insira o valor a ser transferido");
				c1.transfere(teclado.nextFloat(), c2);
				break;
			// #endif
			//#if Ver_Dados
			case 'J':
				System.out.print(c1.toString());
				break;
			//#endif
			case 'S':
				System.out.println("Encerrando execucao");
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		} while (op != 'S');
		teclado.close();
	}

}
