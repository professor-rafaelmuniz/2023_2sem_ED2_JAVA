package classes;
import java.util.ArrayList;
import java.util.Objects;

public class Vertice {
	 private int numero;
     private ArrayList<Aresta> aresta;
 
     Vertice(int num) {
         this.numero = num;
         this.aresta = new ArrayList<Aresta>();
     }

     void addAresta(Aresta e) {
         aresta.add(e);
     }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Aresta> getAresta() {
		return aresta;
	}

	public void setAresta(ArrayList<Aresta> aresta) {
		this.aresta = aresta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertice other = (Vertice) obj;
		return numero == other.numero;
	}

	
	
}
