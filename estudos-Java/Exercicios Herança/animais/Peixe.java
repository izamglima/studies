package exercicio_heranca_izabela;

public class Peixe extends Animal {
	
	protected String caracteristica;

	public Peixe(String nome, String cor, int comprimento, float velocidade, String caracteristica) {
		super(nome, cor, "Mar",  comprimento, velocidade, 0);
		this.caracteristica = caracteristica;
	}
	
	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public String caracteristica() {
		return this.caracteristica;
	}
	
	public void mostraDados() {
		System.out.printf("Nome: %s  Cor: %s  Ambiente: %s  Comprimento: %d  Velocidade: %.2f  Patas: %d Caracteristicas: %s; \n", this.nome, this.cor, this.ambiente, this.comprimento, this.velocidade, this.patas, this.caracteristica);
	}
}
