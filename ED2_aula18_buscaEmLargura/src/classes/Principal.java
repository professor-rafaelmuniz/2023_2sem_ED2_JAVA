package classes;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Vertice> vertices = new ArrayList<Vertice>();
		ArrayList<Aresta> arestas = new ArrayList<Aresta>();
		
        Vertice v10 = new Vertice(10);
        Vertice v20 = new Vertice(20);
        Vertice v30 = new Vertice(30);
        Vertice v40 = new Vertice(40);
        vertices.add(v10);
        vertices.add(v20);
        vertices.add(v30);
        vertices.add(v40);

        Aresta v10_20 = new Aresta(v10, v20);
        Aresta v10_30 = new Aresta(v10, v30);
        Aresta v20_30 = new Aresta(v20, v30);
        Aresta v30_40 = new Aresta(v30, v40);
        
        arestas.add(v10_20);
        v10.addAresta(v10_20);
        v20.addAresta(v10_20);
        
        
        
        arestas.add(v10_30);
        v10.addAresta(v10_30);
        v30.addAresta(v10_30);
        
        arestas.add(v20_30);
        v20.addAresta(v20_30);
        v30.addAresta(v20_30);
        
        arestas.add(v30_40);
        v30.addAresta(v30_40);

        v40.addAresta(v30_40);
        
        for (Vertice listaVertices : vertices) {
        	System.out.println(" ---> Vizinhos do " +listaVertices.getNumero());
            for (Aresta aresta : listaVertices.getAresta()) {
                Vertice vertice1 = aresta.getV1();
                Vertice vertice2 = aresta.getV2();
            	System.out.print(vertice1.getNumero() + " - " + vertice2.getNumero() + " | ");
            }
            System.out.println("");
        }
        
        Buscas busca = new Buscas();
        busca.buscaEmLargura(v10);
        
        
    }
}
