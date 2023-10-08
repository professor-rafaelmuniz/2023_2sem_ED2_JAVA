package aula;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor v = new Vetor();
		v.preencherVetor();
		JOptionPane.showMessageDialog(null, v);
		//int valorBuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que será buscado:"));
		//Busca buscar = new Busca();
		//buscar.buscaSequencial(valorBuscado, v.getVetor());
		//buscar.buscaBinaria(valorBuscado, v.getVetor());
		//buscar.buscaBinaria(valorBuscado, v.getVetor(), 0, v.getVetor().length);
		Ordenacao o = new Ordenacao();
		//o.bubbleSort(v.getVetor());
		o.selectionSort(v.getVetor());
		JOptionPane.showMessageDialog(null, v);
	}

}
