package aula;

public class No {
	private char letra;
	private No esq;
	private No dir;
	
	No(){
		
	}
	No (char letra){
		this.letra = letra;
		this.esq = null;
		this.dir = null;
	}
	
	No (No esq, No dir){
		this.esq = esq;
		this.dir = dir;
	}
	
	public void preOrdem(No raiz) {
		if(raiz != null) {
			System.out.print(raiz.getLetra()+ " ");
			preOrdem(raiz.getEsq());
			preOrdem(raiz.getDir());
		}
	}
	
	public void emOrdem(No raiz) {
		if(raiz != null) {
			emOrdem(raiz.getEsq());
			System.out.print(raiz.getLetra() + " ");
			emOrdem(raiz.getDir());
		}
	}
	
	public void posOrdem(No raiz) {
		if(raiz != null) {
			posOrdem(raiz.getEsq());
			posOrdem (raiz.getDir());
			System.out.print(raiz.getLetra()+ " ");
		}
	}
	
	
	
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
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
	
	
	
}
