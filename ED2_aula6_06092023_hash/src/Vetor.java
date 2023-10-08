import javax.swing.JOptionPane;

public class Vetor {
	
	private int vetor[];
	
	Vetor(int tamanho){
				
		vetor = new int[tamanho];
	}

	public int getVetor(int indice) {
		return vetor[indice];
	}

	public void setVetor(int valor, int indice) {
		if (vetor[indice] == 0) {
			this.vetor[indice] = valor;
		}else {
			boolean alterou = false;
			// Colisao
			//
			int inicio = indice+1;
			int fim = vetor.length;
			for (int i = inicio;  i < fim ; i++) {
				if (vetor[i] == 0 ) {
					this.vetor[i] = valor;
					alterou = true;
					break;
				}
				if (i == fim-1 ) {
					i = -1;// Tem que ser -1 pois ele vai incrementar logo em seguida
					fim = indice;
				}
			}
			/*
			if (!alterou) {
				for (int i = 0; i < indice; i++) {
					if (vetor[i] == 0 ) {
						this.vetor[i] = valor;
						alterou = true;
						break;
					}
				}
			}
			*/
			
		}
		
		
		
	}
	
	public void imprimirVetor() {
		
		String retorno = "";
	
		
		for(int i : vetor) {
			retorno = retorno + String.valueOf(i)+ " - " ;
		}
		JOptionPane.showMessageDialog(null, retorno);
		
	}
	
	
	
}
