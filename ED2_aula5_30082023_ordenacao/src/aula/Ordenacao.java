package aula;

import javax.swing.JOptionPane;

public class Ordenacao {
	
	
	
	public void bubbleSort(int vetor[]) {
		for (int i = vetor.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (vetor[j] > vetor[j+1]) {
					int aux = vetor[j];
					vetor[j] =  vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
	}
	
	public void selectionSort(int vetor[]) {
		//int menorValor;
		int indiceMenorValor;
		boolean trocou = false;
		for (int i = 0; i < vetor.length; i++) {
			indiceMenorValor = i;
			for (int j = i; j <vetor.length; j++) {
				if (vetor[j] < vetor[indiceMenorValor]) {
					indiceMenorValor = j;
					trocou = true;
				}
			}
			// TROCA
			if (trocou) {
				int aux;
				aux = vetor[indiceMenorValor];
				vetor[indiceMenorValor] = vetor[i];
				vetor[i] = aux;
				trocou = false;
			}
		}
	}
	
	public void insertSort(int vetor[]) {
		
		int aux;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];		
			for (int j = i - 1 ; j >= 0 ; j-- ) {
				if (vetor[j] <= aux) {
					break;
				}else {
					vetor[j+1] = vetor[j];
					vetor[j] = aux;
;
				}
			
			}
				
		}
		
		
		
	}

	
}
