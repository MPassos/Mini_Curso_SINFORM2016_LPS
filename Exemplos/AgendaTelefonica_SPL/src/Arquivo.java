import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * TODO description
 */
public class Arquivo {
	private File arquivo = new File("contatos.txt");
	private Agenda ag;

	public Arquivo() {
	}

	public Arquivo(File arquivo, Agenda ag) {
		this.arquivo = arquivo;
		this.ag = ag;
	}

	public void carregarAgenda() throws IOException {
		String aux = "";
		String[] contato;
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {
				aux = br.readLine();
				contato = aux.split("#");
				Contato novo = new Contato(contato[0], contato[1], contato[2], contato[3]);
				ag.adcionaContato(novo);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, abortando operação");
		}
	}
	
	public void gravarAgenda() throws IOException{
		this.arquivo.delete();
		this.arquivo = new File("contatos.txt");
		try{
			FileWriter fw = new FileWriter(this.arquivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(ag.toString());
			bw.close();
		}catch (FileNotFoundException e){
			System.out.println("Arquivo não encontrado");
		}
	}

	//#if Importar
	public void importarAgenda(String nome_arquivo) throws IOException {
		File arquivo = new File(nome_arquivo);
		String aux = "";
		String[] contato;
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {
				aux = br.readLine();
				contato = aux.split("#");
				Contato novo = new Contato(contato[0], contato[1], contato[2], contato[3]);
				ag.adcionaContato(novo);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
	}
	//#endif
	
	//#if Exportar
	public void exportarAgenda(String nome_arquivo) throws IOException{
		File arquivo = new File(nome_arquivo);
		try{
			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(ag.toString());
			bw.close();
		}catch (FileNotFoundException e){
			System.out.println("Arquivo não encontrado");
		}
	}
	//#endif

}