/**
 * TODO description
 */
public class Contato {
	private String nome;
	private String sobrenome; 
	private String ddd;
	private String numero; 
	
	
	public Contato(){}
	
	public Contato(String nome){
		this.nome = nome;
	}
	
	public Contato(String nome, String sobrenome, String ddd, String numero){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String toString(){
		String aux = "";
		aux += "Nome:" + getNome();
		aux += "\nSobrenome:"+ getSobrenome();
		aux += "\nTelefone:("+ getDdd()+")"+getNumero()+"\n";
		return aux;		
	}
	
}