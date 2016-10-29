package lista4;

public class Livro extends Produto {

	private String autor;
	
	public Livro ( int barCode, String autor ) {

		this ( null, 0f, barCode, autor );
	}
	
	@Override
	public Livro Clone () {
		
		return new Livro ( nome, preco, barCode, autor );
	}
	
	public Livro ( String nome, float preco, int barCode, String autor ) {
		
		super ( nome, preco, barCode );
		this.autor = autor;
	}

	public String getAutor () {
		
		return autor;
	}

	public void setAutor ( String autor ) {
		
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", nome =" + getNome() + ", preco = " + getPreco() + "]";
	}

}
