import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vertice v1 = new Vertice(10);
		Vertice v2 = new Vertice(20);
		Vertice v3 = new Vertice(30);
		Vertice v4 = new Vertice(40);

		Aresta a1 = new Aresta(v1, v2);
		Aresta a2 = new Aresta(v1, v3);
		
		v1.setVizinho(a1);
		v1.setVizinho(a2);
		
		v1.imprimirVertice(v1);
		//JOptionPane.showMessageDialog(null, v1);
		//JOptionPane.showMessageDialog(null, v1);
		
		
	}

}
