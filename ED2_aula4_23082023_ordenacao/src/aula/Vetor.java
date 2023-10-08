package aula;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vetor {
	private int vetor[];
	private int tamanho;
	
	Vetor(){
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		vetor = new int[tamanho];
	}
	
	public void preencherVetor() {
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do índice "+ i + ":"));
		}
	}
	
	public void imprimirVetor() {
		for (int i = 0; i < tamanho; i++) {
			JOptionPane.showMessageDialog(null, vetor[i]);
		}
	}
	
	public int[] getVetor() {
		return vetor;
	}

	@Override
	public String toString() {
		return "Vetor [vetor=" + Arrays.toString(vetor) + "]";
	}
	
	
	
	
}
