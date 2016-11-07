/**
 * TODO description
 */
public class Conta {
	private float saldo;
	private int num_conta;
	private String titular;
	
	//#if Limite
	private float limite;
	//#endif
	
	//#if !Limite
//@	public Conta(float saldo, int num_conta, String titular){
//@		this.saldo = saldo;
//@		this.num_conta = num_conta;
//@		this.titular = titular;
//@	}
	//#endif
	
	//#if Limite
		public Conta(float saldo, int num_conta, String titular,float limite){
			this.saldo = saldo;
			this.num_conta = num_conta;
			this.titular = titular;
			this.limite = limite;
		}
	//#endif
		
	public Conta(){
		this.saldo = 0;
		this.num_conta = 0;
		this.titular = "";
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//#if Limite
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
		System.out.println("Limite:"+ this.limite);
	}
	//#endif
	
	public void saque(float valor){
		if(valor < this.saldo){
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso");
			System.out.println("Saldo atual:"+this.getSaldo());
			return;
		}else{
			System.out.println("Saldo insuficiente");
			return;
		}
	}
	
	public void deposito(float valor){
		this.saldo += valor;
		System.out.println("Deposito realizado com sucesso");
		System.out.println("Saldo atual:"+this.getSaldo());
		return;
	}

	//#if Transferencia
	public void transfere(float valor, Conta destino){
		if(valor < this.saldo){
			destino.deposito(valor);
			this.saldo -= valor;
			System.out.println("Transferencia Realizada");
			System.out.println("Saldo atual:"+this.getSaldo());
		}else{
			System.out.println("Saldo insuficiente");
		}
		
	}
	//#endif

}
