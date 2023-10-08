
public class Principal {
	
	
	public static void main ( String args[]) {
		No raiz = new No(10);
		
		No num5 = new No(5);
		No num30 = new No(30);
		No num2 = new No(2);
		raiz.inserirNo(raiz, num5);
		raiz.inserirNo(raiz, num30);
		raiz.inserirNo(raiz, num2);
		
		
		raiz.buscarValor(raiz, 5, 0);
		
		//raiz.removerNoFolha(raiz, 20);
		
		System.out.println("PRÉ ORDEM: ");
		raiz.preOrdem(raiz);
		System.out.println("\nEM-ORDEM: ");
		raiz.emOrdem(raiz);
		System.out.println("\nPÓS-ORDEM: ");
		raiz.posOrdem(raiz);
		
	}
	
	
	
	
	
	
	
	
}
