package exercicio_heranca_izabela;

public class Mamifero extends Animal {
	protected String alimento;

	public Mamifero(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas, String alimento) {
		super(nome, cor, ambiente, comprimento, velocidade, patas);
		this.alimento = alimento;
	}
	
	public void alteraAlimento(String alimento){
		this.alimento = alimento;
	}
	
	public String alimento(){
		return this.alimento;
	}
	
	public void mostraDados() {
		System.out.printf("Nome: %s  Cor: %s  Ambiente: %s  Comprimento: %d  Velocidade: %.2f  Patas: %d Alimento: %s; \n", this.nome, this.cor, this.ambiente, this.comprimento, this.velocidade, this.patas, this.alimento);
	}
}
