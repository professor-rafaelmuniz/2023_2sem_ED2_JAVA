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
		//for (int x = 0; x < vetor.length; x++) {
		//	System.out.println( vetor[x]);
		//}
		
	}

	
}
