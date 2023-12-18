package aula;

import javax.swing.JOptionPane;

public class NoLetra {
	private char letra;
	private NoLetra esq;
	private NoLetra dir;
	
	NoLetra(){
		
	}
	
	NoLetra (char letra){
		this.letra = letra;
		this.esq = null;
		this.dir = null;
	}
	
	NoLetra (NoLetra esq, NoLetra dir){
		this.esq = esq;
		this.dir = dir;
	}
	
	public void inserirNovoNo(NoLetra raiz, NoLetra novoNo) {
		if (raiz == null) {
			// VER DEPOIS
			raiz = novoNo;
		}else if (raiz.getLetra() == novoNo.getLetra()) {
			System.out.println("Letra duplicada");
		}else {
			if (novoNo.getLetra() < raiz.getLetra()) {
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
	
	public void preOrdem(NoLetra raiz) {
		if(raiz != null) {
			System.out.print(raiz.getLetra()+ " ");
			preOrdem(raiz.getEsq());
			preOrdem(raiz.getDir());
		}
	}
	
	public void emOrdem(NoLetra raiz) {
		if(raiz != null) {
			emOrdem(raiz.getEsq());
			System.out.print(raiz.getLetra() + " ");
			emOrdem(raiz.getDir());
		}
	}
	
	public void posOrdem(NoLetra raiz) {
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
	public NoLetra getEsq() {
		return esq;
	}
	public void setEsq(NoLetra esq) {
		this.esq = esq;
	}
	public NoLetra getDir() {
		return dir;
	}
	public void setDir(NoLetra dir) {
		this.dir = dir;
	}
	
	
	
}
