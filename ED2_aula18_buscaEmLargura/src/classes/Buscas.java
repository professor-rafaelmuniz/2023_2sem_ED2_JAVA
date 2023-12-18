package classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Buscas {

	private Queue<Vertice> fila = new LinkedList<Vertice>();
	private ArrayList<Vertice> visitados = new ArrayList<Vertice>();
	
	public void buscaEmLargura(Vertice verticeInicial) {
		fila.add(verticeInicial);
		while(!fila.isEmpty()) {
			Vertice verticeAtual = fila.poll();
			if(!visitados.contains(verticeAtual)) {
				visitados.add(verticeAtual);
			}
			ArrayList<Aresta> vizinhos = verticeAtual.getAresta();
			for (Aresta arestaAtual : vizinhos) {
				if (!visitados.contains(arestaAtual.getV2())&& !(fila.contains(arestaAtual.getV2()))){
					fila.add(arestaAtual.getV2());
				}

			}
		}
		for (Vertice vertice : visitados) {
			JOptionPane.showMessageDialog(null, vertice.getNumero());
		}
		//JOptionPane.showMessageDialog(null, visitados);
		
		
		
		
		
	}
	
}
