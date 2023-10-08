import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int indice;
		Vetor vetor = new Vetor(tamanho);
		Hash hash = new Hash();
		int numero;
		do {
			numero = Integer.parseInt( JOptionPane.showInputDialog("Digite o numero desejado:"));
			indice = hash.metodoDaDivisao(tamanho, numero);
			vetor.setVetor(numero, indice);
			
			if (numero != 0 ) {
				vetor.imprimirVetor();
			}
			
		}while (numero != 0);
		
		
	}

}
