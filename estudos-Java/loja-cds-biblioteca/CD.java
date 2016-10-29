package lista4;

public class CD extends Produto {

	private int numFaixas;
	
	public CD ( int barCode ) {
		
		this ( barCode, 0 );
	}
	
	public CD ( int barCode, int numFaixas ) {

		this ( null, 0f, barCode, numFaixas );
	}

	public CD ( String nome, float preco, int barCode, int numFaixas ) {
		
		super ( nome, preco, barCode );
		this.numFaixas = numFaixas;
	}

	@Override
	public CD Clone () {
		
		return new CD ( nome, preco, barCode, numFaixas );
	}
	
	public int getNumFaixas() {
		
		return numFaixas;
	}

	public void setNumFaixas ( int numFaixas ) {
	
		this.numFaixas = numFaixas;
	}

	@Override
	public String toString () {
	
		return "CD [Numero de Faixas=" + numFaixas + ", Nome =" + getNome() + ", Preco =" + getPreco() + "]";
	}
}
