import tarefa1.VerificadorPrimosUsandoFor;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		VerificadorPrimosUsandoFor objNum1 = new VerificadorPrimosUsandoFor();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = leitor.nextInt();
		
		if(objNum1.ehPrimo(num)) {
			System.out.println("Número primo. (Usando For.)");
		} else {
			System.out.println("Não é primo. (Usando For.)");
		}
		
		if(objNum1.VerificadorPrimosUsandoWhile(num)){
			System.out.println("Número primo. (Usando While.)");
		} else {
			System.out.println("Não é primo. (Usando While.)");
		}
		
		if(objNum1.VerificadorPrimosUsandoDoWhile(num)){
			System.out.println("Número primo. (Usando Do-While.)");
		} else {
			System.out.println("Não é primo. (Usando Do-While.)");
		}
	}

}
