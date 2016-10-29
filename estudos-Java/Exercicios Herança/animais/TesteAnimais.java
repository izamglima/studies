package exercicio_heranca_izabela;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Camelo", "Amarelo", "Terra", 150, (float)2.0, 4);
		animal1.mostraDados();
		
		Peixe peixe1 = new Peixe("Tubarão", "Cinzento", 300, (float) 1.5, "Barbatanas e cauda");
		peixe1.mostraDados();
		
		Mamifero mamifero1 = new Mamifero("Urso-do-Canadá", "Vermelho", "Terra", 180, (float) 0.5, 4, "Mel");
		mamifero1.mostraDados();
		
		System.out.println("\nTesteAnimais2");
		//TesteAnimais2
		int i= 0;
		int escolha;
		String nome;
		String cor; 
		String ambiente; 
		int comprimento; 
		float velocidade; 
		int patas;
		Animal[] vetorAnimal = new Animal[9];
		Peixe[] vetorPeixe = new Peixe[9];
		Mamifero[] vetorMamifero = new Mamifero[9];
		
		do {
			System.out.println("\nDigite sua opção:\n(1) Animal\n(2) Peixe\n(3) Mamífero\n(4) Sair");
			Scanner sc = new Scanner(System.in);
			escolha = sc.nextInt();
			sc.nextLine();
			switch(escolha){
			case 1:
				if(i >= 9){
					System.out.println("Máximo do limite atingido.");
					break;
				}
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Cor: ");
				cor = sc.nextLine();
				System.out.print("Ambiente: ");
				ambiente = sc.nextLine();
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				sc.nextLine();
				System.out.print("Velocidade: ");
				velocidade = sc.nextFloat();
				sc.nextLine();
				System.out.print("Patas: ");
				patas = sc.nextInt();
				sc.nextLine();
				vetorAnimal[i] = new Animal(nome, cor, ambiente, comprimento, velocidade, patas);
				vetorAnimal[i].mostraDados();
				i++;
				break;
				
			case 2:
				if(i >= 9){
					System.out.println("Máximo do limite atingido.");
					break;
				}
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Cor: ");
				cor = sc.nextLine();
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				sc.nextLine();
				System.out.print("Velocidade: ");
				velocidade = sc.nextFloat();
				sc.nextLine();
				String caracteristica;
				System.out.print("Caracteristica: ");
				caracteristica = sc.nextLine();
				vetorPeixe[i] = new Peixe(nome, cor, comprimento, velocidade, caracteristica );
				vetorPeixe[i].mostraDados();
				i++;
				break;
				
			case 3:
				if(i >= 9){
					System.out.println("Máximo do limite atingido.");
					break;
				}
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Cor: ");
				cor = sc.nextLine();
				System.out.print("Ambiente: ");
				ambiente = sc.nextLine();
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				sc.nextLine();
				System.out.print("Velocidade: ");
				velocidade = sc.nextFloat();
				sc.nextLine();
				System.out.print("Patas: ");
				patas = sc.nextInt();
				sc.nextLine();
				String alimento;
				System.out.print("Alimento: ");
				alimento = sc.nextLine();
				vetorMamifero[i] = new Mamifero(nome, cor, ambiente, comprimento, velocidade, patas, alimento );
				vetorMamifero[i].mostraDados();
				i++;
				break;
			case 4:
				break;
			}
		} while(escolha != 4);
	}
}
