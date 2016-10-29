package exercicios_colletions_izabela;
import java.util.ArrayList;
import java.util.List;

public class FiltraPares {
	
	List<Integer> numerosGerais = new ArrayList<Integer>();
	
	
	public void adicionar(int numero) {
		numerosGerais.add(numero);
		
	}
	
	public List<Integer> obterListaDePares(){
		int count = numerosGerais.size();
		System.out.println("Total de números inseridos: " + count);
		
		for (int i = 0; i < numerosGerais.size(); i++) {
			if(numerosGerais.get(i) % 2 == 0) {
			    int value = numerosGerais.get(i);
			    System.out.println("Números pares inseridos: ");
			    System.out.println(" " + value + ", ");
			}
		}
		return numerosGerais;

	}

}
