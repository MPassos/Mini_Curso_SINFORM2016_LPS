

/**
 * TODO description
 */
abstract class Main$$Hello {
	public void print(){
		System.out.print("Hello");
	}
	
	public static void main(String args[]){
		new Main().print();
	}

}

/**
 * TODO description
 */
public class Main extends  Main$$Hello  {
	public void print(){
		super.print();
		System.out.print(" world!");
	}
}