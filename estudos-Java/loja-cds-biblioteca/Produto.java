package lista4;

public class Produto {

	protected String nome;
	protected float preco;
	
	protected int barCode;
	
	public Produto ( int barCode ) {
		
		this ( null, 0f, barCode );
	}
	
	public Produto ( String nome, float preco, int barCode ) {
		
		this.nome = nome;
		this.preco = preco;
		this.barCode = barCode;
	}

	public Produto Clone () {
		
		return new Produto ( nome, preco, barCode );
	}
	
	@Override
    public boolean equals ( Object obj ) {
		
       if ( !( obj instanceof Produto ) ) {
        
    	   return false;
       }

       try {
       
    	   Produto test = ( Produto ) obj;
           return this.getBarCode () == test.getBarCode () ? true : false;
           
       } catch ( java.lang.ClassCastException e ) { System.out.println ( e.getMessage() ); }
    
       return false;
    }
	
	public String getNome () {
	
		return nome;
	}
	
	public void setNome ( String nome ) {
	
		this.nome = nome;
	}
	
	public float getPreco () {
	
		return preco;
	}
	
	public void setPreco ( float preco ) {
	
		this.preco = preco;
	}

	public int getBarCode () {
		
		return barCode;
	}

	public void setBarCode ( int barCode ) {
		
		this.barCode = barCode;
	}
	
}
