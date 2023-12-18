
public class Aresta {
	private Vertice ponta1;
	private Vertice ponta2;
	
	
	Aresta(){
		
	}
	
	Aresta(Vertice p1, Vertice p2){
		this.ponta1 = p1;
		this.ponta2 = p2;
		
	}

	public Vertice getPonta1() {
		return ponta1;
	}

	public void setPonta1(Vertice ponta1) {
		this.ponta1 = ponta1;
	}

	public Vertice getPonta2() {
		return ponta2;
	}

	public void setPonta2(Vertice ponta2) {
		this.ponta2 = ponta2;
	}

	@Override
	public String toString() {
		return "A";//"Aresta [ponta1=" + ponta1 + ", ponta2=" + ponta2 + "]";
	}
	
	
	
	
}
