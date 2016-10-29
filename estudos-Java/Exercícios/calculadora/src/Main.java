import tarefa3.ExecutorComandosVetorInt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorComandosVetorInt executor = new ExecutorComandosVetorInt();

		int[] numeros = {1, 2, 3, 4, 10};
		System.out.println("Soma de [1, 2, 3]: " + executor.executar("soma", numeros));
		System.out.println("Multiplicação de [1, 2, 3]: " + executor.executar("multiplicacao", numeros));
		System.out.println("Encontrar menor em [1, 2, 3]: " + executor.executar("menor", numeros));
		System.out.println("Encontrar maior em [1, 2, 3]: " + executor.executar("maior", numeros));
		System.out.println("Encontrar 2 em [1, 2, 3]: posição " + executor.executar("encontrar 2", numeros));
	}

}
