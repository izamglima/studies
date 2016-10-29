package exercicios_colletions_izabela;
import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
//		// 1)
//		System.out.println("\nExercício 1)");
//		VerificaInstancias objVerificar = new VerificaInstancias();
//
//		Object a = new Object();
//		Object b = new Object();
//		a = b;
//
//		Integer obj3 = 123;
//		Integer obj4 = 1235;
//
//		if(objVerificar.saoAMesmaInstancia(a, b)) {
//			System.out.println("São a mesma instância.");
//		} else {
//			System.out.println("Não são a mesma intância.");
//		}
//
//		if(objVerificar.saoLogicamenteIguais(obj3, obj4)){
//			System.out.println("São logicamente iguais.");
//		} else {
//			System.out.println("Não são logicamente iguais.");
//		}


//		// 2)
//		System.out.println("\nExercício 2)");
//		CalculaSucessor objCalculadorDeSucessor = new CalculaSucessor();
//		System.out.println(objCalculadorDeSucessor.sucessorDe(99));
//
//		Integer obj5 = 41;
//		System.out.println(objCalculadorDeSucessor.sucessorDe(obj5));

		
		// 3)
//		System.out.println("\nExercício 3)");
//		
//		int max = 10, input;
		Scanner scan = new Scanner(System.in);
//		FiltraPares objFiltraPares = new FiltraPares();
//		
//		System.out.println("Digite "+ max + " inteiros: ");
//		for (int i = 0; i < max; i++){
//			input = Integer.parseInt(scan.nextLine());
//			objFiltraPares.adicionar(input);
//		}
//		
//		objFiltraPares.obterListaDePares();
		
//		// 4)
//		System.out.println("\nExercício 4)");
//		System.out.print("Digite o nome do aluno: ");
//		String nome;
//		nome= scan.nextLine();
//		System.out.print("Digite a nota do aluno: ");
//		double nota;
//		nota= Double.parseDouble(scan.nextLine());
//		FiltroAlunosAprovados objAluno = new FiltroAlunosAprovados(nome, nota);
//		objAluno.adicionar(nome, nota);
//		objAluno.obterListaDeAprovados();
		
		//5)
		System.out.println("\nExercício 5)");
	    System.out.println("Digite uma frase:");
	    String frase;
	    frase = scan.nextLine();
	    ContadorPalavras objContadorPalavras = new ContadorPalavras();
	    System.out.println("Numero de palavras: " + objContadorPalavras.contarPalavrasConsiderandoRepeticoes(frase));
	}

}
