
public class No {
	
	private int valor;
	private No esq;
	private No dir;
	
	No(int valor){
		this.valor = valor;
		this.esq = null;
		this.dir = null;
	}
	
	public void inserirNo(No raiz, No novoNo) {
		if (raiz == null) {
			raiz = novoNo;
		}else {
			if (novoNo.getValor() < raiz.getValor()) {
				// esq
				if (raiz.getEsq() == null) {
					raiz.setEsq(novoNo);
				}else {
					inserirNo(raiz.getEsq(), novoNo);
				}
			}else if (novoNo.getValor()> raiz.getValor()){
				if (raiz.getDir() == null) {
					raiz.setDir(novoNo);
				}else {
					inserirNo(raiz.getDir(), novoNo);
				}
			}else {
				System.out.println("Números iguais");
			}
		}
		
		
		
	}
	
	
	public void buscarValor(No raiz, int valor, int contador) {
		if (raiz == null) {
			if(contador == 0) {
				System.out.println("Árvore vazia");
			}else {
				System.out.println("Valor NÃO encontrado");
			}
			
		}else if(raiz.getValor() == valor) {
			System.out.println("Valor encontrado no nivel: " + contador );
		}else if (valor < raiz.getValor()) {
			buscarValor(raiz.getEsq(), valor, ++contador);
		}else {
			buscarValor(raiz.getDir(), valor, ++contador);
		}
	}
	
	
	public void removerNoFolha(No raiz, No pai, int valor) {
		
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
	
	public int getValor() {
		return this.valor;
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
			emOrdem(raiz.getEsq());
			System.out.print(raiz + " ");
			emOrdem(raiz.getDir());
		}
	}
	
	public void posOrdem(No raiz) {
		//1 Esq
		//2 Dir
		//3 Raiz
		
		if (raiz != null) {
			posOrdem(raiz.getEsq());
			posOrdem(raiz.getDir());
			System.out.print(raiz + " ");
		}
	}

	@Override
	public String toString() {
		return " " + valor + " ";
	}
	
}
