package aula;

public class Principal {
	public static void main(String args[]) {
		No raiz = new No();
		raiz.setLetra('D');
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
