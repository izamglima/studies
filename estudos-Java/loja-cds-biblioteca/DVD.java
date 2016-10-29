package lista4;

public class DVD extends Produto {
	
	private float duracao;
	
	public DVD ( int barCode ) {
		
		this ( barCode, 0f );
	}
	
	public DVD ( int barCode, float duracao ) {

		this ( null, 0f, barCode, duracao );
	}

	public DVD ( String nome, float preco, int barCode, float duracao ) {
		
		super ( nome, preco, barCode );
		this.duracao = duracao;
	}

	@Override
	public DVD Clone () {
		
		return new DVD ( nome, preco, barCode, duracao );
	}
	
	public float getDuracao () {
		
		return duracao;
	}

	public void setDuracao ( float duracao ) {
	
		this.duracao = duracao;
	}

	@Override
	public String toString () {
	
		return "CD [Duracao =" + duracao + " horas, Nome =" + getNome() + ", Preco =" + getPreco() + "]";
	}
}
