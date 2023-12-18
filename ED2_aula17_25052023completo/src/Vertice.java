import java.util.ArrayList;

public class Vertice {
	private int numero; 
	private Aresta vizinho;
	
	Vertice(int num){
		this.numero = num;
	}
	
	
	
	

	public Aresta getVizinho() {
		return vizinho;
	}

	public void setVizinho(Aresta vizinho) {
		this.vizinho = vizinho;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	
	public void imprimirVertice(Vertice vertice) {
		System.out.println("Vertice [numero=" + vertice.numero + "]");
		System.out.println(vertice.getVizinho().getPonta1() + "->" + vertice.getVizinho().getPonta2());
	}





	@Override
	public String toString() {
		return "Vertice [numero=" + numero + ", vizinho=" + vizinho + "]";
	}
	
	

	
	
	
	
}
