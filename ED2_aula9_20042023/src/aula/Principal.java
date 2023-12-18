package aula;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String args[]) {
		
		No raiz = new No();
		//raiz.setNumero(50);
		
		//raiz.removerNoFolha(raiz, raiz);
		
		int continuar = 1;	
		do {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado:"));
			No numero = new No (num);
			raiz.inserirNovoNo(raiz, numero);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar"));
		}while(continuar == 1);
		
		No remover = new No(10);
		
		System.out.println("PRE-ORDEM");
		raiz.preOrdem(raiz);
		
		
		raiz.removerNoFolha(raiz, remover);
		
				
		System.out.println("PRE-ORDEM");
		raiz.preOrdem(raiz);
		
		 
	}
}
