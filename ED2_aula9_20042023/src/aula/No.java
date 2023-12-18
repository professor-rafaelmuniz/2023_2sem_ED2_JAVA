package aula;

public class No {

	private int numero;
	private No esq;
	private No dir;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}

	No(){
		
	}
	
	No (int numero){
		this.numero = numero;
		this.esq = null;
		this.dir = null;
	}
	
	No (No esq, No dir){
		this.esq = esq;
		this.dir = dir;
	}
	
	public void inserirNovoNo(No raiz, No novoNo) {
		if (raiz == null) {
			// VER DEPOIS
			raiz = novoNo;
		}else if (raiz.getNumero() == novoNo.getNumero()) {
			System.out.println("Letra duplicada");
		}else {
			if (novoNo.getNumero() < raiz.getNumero()) {
				// ESQ
				if (raiz.getEsq() == null) {
					raiz.setEsq(novoNo);
				}else {
					inserirNovoNo(raiz.getEsq(), novoNo);
				}
			}else {
				//DIR
				if (raiz.getDir() == null) {
					raiz.setDir(novoNo);
				}else {
					inserirNovoNo(raiz.getDir(), novoNo);
				}
				
			}
		}
	
	}
	
	public void removerNoFolha(No raiz, No remover) {
		if (raiz.getNumero() ==  remover.getNumero()) {
			if (raiz.getEsq() == null && raiz.getDir() == null) {
				raiz = null;
			}
		}else if (remover.getNumero() < raiz.getNumero()){
			removerNoFolha(raiz.getEsq(), remover);
		}else {
			removerNoFolha(raiz.getDir(), remover);
		}
		
	}
	
	
	public void preOrdem(No raiz) {
		if(raiz != null) {
			System.out.print(raiz.getNumero()+ " ");
			preOrdem(raiz.getEsq());
			preOrdem(raiz.getDir());
		}
	}
	
	public void emOrdem(No raiz) {
		if(raiz != null) {
			emOrdem(raiz.getEsq());
			System.out.print(raiz.getNumero() + " ");
			emOrdem(raiz.getDir());
		}
	}
	
	public void posOrdem(No raiz) {
		if(raiz != null) {
			posOrdem(raiz.getEsq());
			posOrdem (raiz.getDir());
			System.out.print(raiz.getNumero()+ " ");
		}
	}
	

}
