import tarefa2.ExecutorComandosString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorComandosString executor = new ExecutorComandosString();
		
		System.out.println("Tamanho \"oi\": " + executor.executar("tamanho", "oi"));
		System.out.println("Tamanho \"opa\": " + executor.executar("tamanho", "opa"));
		System.out.println("Contar vogais \"opa\": " + executor.executar("contarVogais", "opa"));
		System.out.println("Contar caractere \"o\" em \"opa, oi\": " + executor.executar("contarCaractere o", "opa, oi"));
	}

}
