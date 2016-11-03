/**
 * TODO description
 */
public class Main {
	public static void main(String args[]){
		
		//#if !Limite
		Conta c1 = new Conta(800,123456,"Fulano");
		Conta c2 = new Conta(1800,789456,"Cicrano");
		//#endif
		
		//#if Limite
//@		Conta c1 = new Conta(800,123456,"Fulano",500);
//@		Conta c2 = new Conta(1800,789456,"Cicrano",700);
		//#endif
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		c1.deposito(400);
		c2.deposito(800);
		
		c1.saque(200);
		c2.saque(300);
		
		//#if Limite
//@		c1.setLimite(700);
//@		c2.setLimite(1300);
		//#endif
		
		//#if Transferencia
		c1.transfere(400,c2);
		//#endif
	}

}
