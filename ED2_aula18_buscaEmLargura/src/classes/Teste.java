package classes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vertice> fila = new ArrayList<Vertice>();
		Vertice v1 = new Vertice(10);
		Vertice v2 = new Vertice(20);
		Vertice v3 = new Vertice(10);
		
		
		fila.add(v1);
		fila.add(v2);
		
		JOptionPane.showMessageDialog(null,fila.contains(v3));
		
		
		
	}

}
