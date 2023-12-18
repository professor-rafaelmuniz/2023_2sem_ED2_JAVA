package aula;

import javax.swing.JOptionPane;

public class PrincipalLetra {
	public static void main(String args[]) {
		NoLetra raiz = new NoLetra();
		raiz.setLetra('D');
		
		NoLetra letraB = new NoLetra ('B');
		NoLetra letraE = new NoLetra ('E');
		NoLetra letraF = new NoLetra ('F');
		NoLetra letraA = new NoLetra ('A');
		
		//raiz.inserirNovoNo(raiz, raiz);
		raiz.inserirNovoNo(raiz, letraB);
		raiz.inserirNovoNo(raiz, letraA);
		raiz.inserirNovoNo(raiz, letraE);
		raiz.inserirNovoNo(raiz, letraF);
		
		
		/*raiz.setLetra('D');
		No letraA = new No ('A');
		No letraB = new No ('B');
		No letraC = new No ('C');
		No letraE = new No ('E');
		No letraF = new No ('F');
		No letraG = new No ('G');
		No letraH = new No ('H');
		raiz.setEsq(letraB);
		raiz.setDir(letraF);
		letraB.setEsq(letraA);
		letraB.setDir(letraC);
		letraA.setEsq(null);
		letraA.setDir(null);
		letraC.setEsq(null);
		letraC.setDir(null);
		letraF.setEsq(letraE);
		letraF.setDir(letraG);
		letraG.setDir(letraH);
		letraE.setEsq(null);
		letraE.setDir(null);
		letraG.setEsq(null);
		
		String letra = JOptionPane.showInputDialog("Digite a letra desejada:");
		*/
		
		System.out.println("PRE-ORDEM");
		raiz.preOrdem(raiz);
		System.out.println("\n");
		System.out.println("EM-ORDEM");
		raiz.emOrdem(raiz);
		System.out.println("\n");
		System.out.println("POS-ORDEM");
		raiz.posOrdem(raiz);
		 
	}
}
