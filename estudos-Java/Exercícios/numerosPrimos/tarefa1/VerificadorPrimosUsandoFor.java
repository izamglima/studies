package tarefa1;

public class VerificadorPrimosUsandoFor {
	
	public boolean ehPrimo(int n)
	{
		int i;
		if (n == 1)
			return false;
		
		for(i = 2; i < n; i++){
			if ((n % i) == 0) {
				return false;
			}
		}
		// se passar e não for divisível por nenhum, é primo
	    return true;
	}
	
	public boolean VerificadorPrimosUsandoWhile(int n){
		int i = 2;
		while(i != n){
			if ((n % i) == 0) {
				return false;
			}
			i ++;
		}
		// se passar e não for divisível por nenhum, é primo
	    return true;
	}
	
	public boolean VerificadorPrimosUsandoDoWhile(int n) {
		int i = 2;
		do {
			if ((n % i) == 0) {
				
				return false;
			}
			i ++;
		} while(i != n);
		// se passar e não for divisível por nenhum, é primo
	    return true;
	}
}
