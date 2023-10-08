
public class Principal {
	
	
	public static void main ( String args[]) {
		No raiz = new No(10);
		
		No num5 = new No(5);
		No num30 = new No(30);
		No num2 = new No(2);
		raiz.setEsq(num30);
		raiz.setDir(num5);
		num30.setDir(num2);
		
		System.out.println("EM ORDEM: ");
		raiz.preOrdem(raiz);
		System.out.println("\nPRÉ-ORDEM: ");
		raiz.emOrdem(raiz);
		System.out.println("\nPÓS-ORDEM: ");
		raiz.posOrdem(raiz);
		
	}
	
	
	
	
	
	
	
	
}
