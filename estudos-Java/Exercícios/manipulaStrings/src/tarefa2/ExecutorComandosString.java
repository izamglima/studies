package tarefa2;

public class ExecutorComandosString {

	public	int	executar(String comando,String	texto) {
		int resultado = 0;
		String[] array = comando.split(" ");
		comando = array[0];
		String parametro = "";
		if (array.length > 1)
			parametro = array[1];
		
		switch (comando) {
			case "tamanho":
				resultado = this.tamanho(texto);
				break;
			case "contarVogais":
				resultado = this.contarVogais(texto);
				break;
			case "contarCaractere":
				resultado = this.contarCaractere(texto, parametro.charAt(0));
				break;
			default:
		}
		
		return resultado;
	}
	
	private int tamanho(String texto) {
		return texto.length();
	}
	
	private int contarVogais(String texto) {
		texto = texto.toLowerCase();
		int count = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			switch (texto.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count ++;
					break;
			    default:
			}
		}
		return count;
	}
	
	private int contarCaractere(String texto, char caracter) {
		int count = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == caracter) {
				count++;
			}
		}
		
		return count;
	}
}
