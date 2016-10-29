package exercicio_heranca_izabela;

public class Animal {
	
	protected String nome;
	protected String cor;
	protected String ambiente;
	protected int comprimento;
	protected float velocidade;
	protected int patas;
	
	public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas ) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento; 
		this.velocidade = velocidade;
		this.patas = patas;
	}
	
	public void alteraNome(String nome) {
		this.nome = nome;
	}
	
	public void alteraCor(String cor) {
		this.cor = cor;
	}
	 
	public void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public void alteraComprimento(int comprimento){
		this.comprimento = comprimento;
	}
	
	public void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public void alteraPatas(int patas) {
		this.patas = patas;
	}
	
	public void mostraDados() {
		System.out.printf("Nome: %s  Cor: %s  Ambiente: %s  Comprimento: %d  Velocidade: %.2f  Patas: %d\n", this.nome, this.cor, this.ambiente, this.comprimento, this.velocidade, this.patas);
	}
	
}
