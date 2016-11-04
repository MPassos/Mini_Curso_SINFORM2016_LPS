import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * TODO description
 */
public class Agenda {
	private ArrayList<Contato> contatos = new ArrayList<Contato>();
	Scanner teclado = new Scanner(System.in);

	public void adcionaContato(Contato contato) {
		contatos.add(contato);
		ordena();
		return;
	}

	public void ordena() {
		Collections.sort(contatos, new Comparator<Contato>() {
			public int compare(Contato c1, Contato c2) {
				return c1.getNome().compareTo(c2.getNome());
			}
		});
	}

	private Contato encontraContato(Contato contato) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome().equals(contato.getNome())) {
				return contatos.get(i);
			}
		}
		System.out.println("Contato n?o encontrado");
		return null;
	}

	public void visualizaAgenda() {
		if (contatos.size() == 0) {
			System.out.println("Agenda Vazia!");
			return;
		}
		for (int i = 0; i < contatos.size(); i++) {
			System.out.print(contatos.get(i).toString());
		}
		return;
	}
	
	public String toString(){
		String aux = "";
		for(int i = 0; i<contatos.size();i++){
			aux+= contatos.get(i).getNome()+"#"+contatos.get(i).getSobrenome()+"#"+
		contatos.get(i).getDdd()+"#"+contatos.get(i).getNumero()+"\n";
		}
		return aux;
	}
	
	//#if Alterar
	public void alteraContato(Contato contato) {
		Contato alt = encontraContato(contato);

		if (alt != null) {
			System.out.print("Digite um novo nome:");
			alt.setNome(teclado.next());
			System.out.print("Digite um novo sobrenome:");
			alt.setSobrenome(teclado.next());
			System.out.print("Digite um novo ddd:");
			alt.setDdd(teclado.next());
			System.out.print("Digite um novo telefone:");
			alt.setNumero(teclado.next());
			return;
		}
	}
	//#endif
	
	//#if Excluir
	public void excluiContato(Contato contato){
		Contato exc = encontraContato(contato);
		
		if(exc != null){
			this.contatos.remove(exc);
			return;
		}
	}
	//#endif
	
	//#if Pesquisa
	public void pesquisaContato(Contato contato){
		Contato pesq = encontraContato(contato);
		
		System.out.print(pesq.toString());
		return;
	}
	//#endif
	
}
