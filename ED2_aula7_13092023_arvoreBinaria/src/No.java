
public class No {
	
	private int valor;
	private No esq;
	private No dir;
	
	No(int valor){
		this.valor = valor;
		this.esq = null;
		this.dir = null;
	}
	
	public void setEsq(No esq) {
		this.esq = esq;
	}
	
	public void setDir(No dir) {
		this.dir = dir;
	}
	
	public No getEsq() {
		return this.esq;
	}
	public No getDir() {
		return this.dir;
	}
	
	
	
	public void preOrdem(No raiz) {
		//1Passo imprimir raiz
		//2 Esq
		//3Dir
		
		if (raiz != null) {
			System.out.print(raiz + " ");
			preOrdem(raiz.getEsq());
			preOrdem(raiz.getDir());
		}
	}
	
	public void emOrdem(No raiz) {
		//1 Esq
		//2 Raiz
		// Dir
		
		if (raiz != null) {

			preOrdem(raiz.getEsq());
			System.out.print(raiz + " ");
			preOrdem(raiz.getDir());
		}
	}
	
	public void posOrdem(No raiz) {
		//1 Esq
		//2 Dir
		//3 Raiz
		
		if (raiz != null) {

			preOrdem(raiz.getEsq());
			preOrdem(raiz.getDir());
			System.out.print(raiz + " ");
		}
	}

	@Override
	public String toString() {
		return " " + valor + " ";
	}
	
}
