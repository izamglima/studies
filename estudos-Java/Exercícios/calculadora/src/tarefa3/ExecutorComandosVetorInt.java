package tarefa3;

public class ExecutorComandosVetorInt {
	public int executar(String comando, int[] numeros) {
		int resultado = 0;
		String[] array = comando.split(" ");
		comando = array[0];
		int parametro = 0;
		if (array.length > 1)
			parametro = Integer.parseInt(array[1]);		
		
		switch(comando) {
  			case "soma":
  				resultado = this.soma(numeros);
  				break;
  			case "multiplicacao":
  				resultado = this.multiplicacao(numeros);
  				break;
  			case "menor":
  				resultado = this.menor(numeros);
  				break;
  			case "maior":
  				resultado = this.maior(numeros);
  				break;
  			case "encontrar":
  				resultado = this.encontrar(numeros, parametro);
  				break;
  			default:
		}
		return resultado;
	}
	
	private int soma(int[] numeros) {
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma = soma + numeros[i];
		}
		
		return soma;
	}
	
	private int multiplicacao(int[] numeros) {
		int multiplicacao = 1;

		for (int i = 0; i < numeros.length; i++) {
			multiplicacao = multiplicacao * numeros[i];
		}
		
		return multiplicacao;
	}

	private int menor(int[] numeros) {
		int menor = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor)
				menor = numeros[i];
		}
		
		return menor;
	}

	private int maior(int[] numeros) {
		int maior = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior)
				maior = numeros[i];
		}

		return maior;
	}

	private int encontrar(int[] numeros, int procurado) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == procurado)
				return i+1;
		}
		
		return 0;
	}
}
