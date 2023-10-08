package aula;

import javax.swing.JOptionPane;

public class Busca {
	
	
	public void buscaSequencial(int valorBuscado, int vetor[]) {
		boolean achou = false;
		for (int i = 0; i < vetor.length; i++) {
			if (valorBuscado == vetor[i]) {
				achou = true;
				break;
			}
		}
		if (achou) {
			JOptionPane.showMessageDialog(null, "ACHOU");
		}else {
			JOptionPane.showMessageDialog(null, "NÃO ACHOU");
		}
	}
	
	public void buscaBinaria(int valorBuscado, int vetor[]) {
		int posicaoInicial = 0;
		int posicaoFinal = vetor.length - 1;
		int meio;
		boolean achou = false;
		while (posicaoInicial <= posicaoFinal) {
			meio = (posicaoInicial + posicaoFinal)/2;
			if (valorBuscado == vetor[meio]) {
				achou = true;
				break;
			}else if (valorBuscado < vetor[meio]) {
				posicaoFinal = meio - 1;
			}else {
				posicaoInicial = meio + 1;
			}
		}
		if (achou) {
			JOptionPane.showMessageDialog(null, "ACHOU");
		}else {
			JOptionPane.showMessageDialog(null, "NÃO ACHOU");
		}
	}
	
	
	public int buscaBinariaRecursiva(int valorBuscado,
									 int vetor[], 
									 int posicaoInicial, 
									 int posicaoFinal) {
		int meio = (posicaoInicial + posicaoFinal)/2 ;
		if (posicaoInicial > posicaoFinal) {
			return 0;// ELE NÃO ACHOU 
		}else if (valorBuscado == vetor[meio]) {
			return 1;// ACHOU
		}else if (valorBuscado < vetor[meio]) {
			return buscaBinariaRecursiva(valorBuscado, vetor, posicaoInicial, meio-1);
		}else {
			return buscaBinariaRecursiva(valorBuscado, vetor, meio+1, posicaoFinal);
		}
	}
	
	
	
}
