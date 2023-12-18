import java.util.ArrayList;

public class Vertice {
	private int numero; 
	private ArrayList<Vertice> vizinho;
	
	Vertice(){
		this.vizinho = new ArrayList<Vertice>();
	}
	
	Vertice(int numero){
		this.numero = numero;
		this.vizinho = new ArrayList<Vertice>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Vertice> getVizinho() {
		return vizinho;
	}

	public void setVizinho(ArrayList<Vertice> vizinho) {
		this.vizinho = vizinho;
	}
	
	public void adicionarVizinho (Vertice vizinho) {
		this.vizinho.add(vizinho);
	}

	@Override
	public String toString() {
		//return "Vertice [numero=" + numero + ", vizinho=" + vizinho + "]";
		return " "+ numero + vizinho;
	}

	
	
	
	
}
