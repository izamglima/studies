package herenca2_izabela;

public class EstrelaAmarela extends ProtoEstrela {
	private String nome;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	public EstrelaAmarela(double temperatura, double magnitude, double luminosidade, String nome) {
		super(temperatura, magnitude, luminosidade);
		this.nome = nome;
	}
}
