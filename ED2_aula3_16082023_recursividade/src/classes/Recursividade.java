package classes;

public class Recursividade {
	
	public int somaRecursiva(int multiplicador, int multiplicando) {
		// 1- CHAMADA
		if (multiplicando == 0) {
			return 0;
		}else {
			return multiplicador + somaRecursiva(multiplicador, multiplicando-1);
		}
		// 2 - CONDICAO DE PARADA
		
		
		
	}
	
	
}
