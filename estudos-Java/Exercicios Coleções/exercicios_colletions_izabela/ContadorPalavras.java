package exercicios_colletions_izabela;


public class ContadorPalavras {
	
	public int contarPalavrasConsiderandoRepeticoes(String palavras) {
		
		int palavra = 0;		
		for (int i = 0; i < palavras.length(); i++) {
			
			if (palavras.charAt(i) == ' ') { 
			      palavra += 1;
			}
			if (palavras.charAt(i) == '.') {
	               palavra += 1;
				  break;
            }				
			else
			{
			      continue;
		    }	
		}
		return palavra;
	}
	
}
