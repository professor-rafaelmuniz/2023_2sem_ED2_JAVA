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
	

	
}
