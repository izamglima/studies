package lista4;

import java.util.LinkedList;

public class Loja {

	public static LinkedList < Produto > produtos = new LinkedList < Produto > ();
	
	public static void main ( String [] args ) {
		
		Produto temp =  new CD ( "Alwfull Mix N-10", 0.50f, 7, 12 );
		
		produtos.add ( new Livro ( "The Hobbit", 59.90f, 10, "Tolkien" ) );
		produtos.add ( new CD ( "Rnd Musics", 999.09f, 999, 99 ) );
		produtos.add ( new DVD ( "A New Hope", 9.90f, 4, 1.50f ) );
		produtos.add ( new Livro ( "Random Book", 13.50f, 1350, "Mr. RAM" ) );
		produtos.add ( temp );
	
		ShowList ( produtos );
		
		SimpleSearch ( produtos, 10 );
		SimpleSearch ( produtos, temp );
		
		InflateProductList ( temp );
		
		SimpleSearch ( produtos, temp );	// Ecrontra o 1 resultado, pois a lista não impede repetição de codigo de barras
		SimpleSearch ( produtos, temp.getBarCode() + 10 );
		
	}
	
	public static < T > void ShowList ( LinkedList < T > toShow ) {
		
		for ( T obj : toShow ) {
			
			System.out.println ( obj.toString() );
		}
	}
	
	public static boolean SimpleSearch ( LinkedList < Produto > searched, Produto toSearch ) {
		
		for ( int index = 0; index < searched.size(); index++ ) {
			
			if ( searched.get ( index ).equals ( toSearch ) ) {
				
				System.out.println ( "Product " + toSearch.toString() + " was found at :" + index );
				return true;
			}
		}
		
		System.out.println ( "Product " + toSearch.toString() + " was not found" );
		return false;
	}
	
	public static boolean SimpleSearch ( LinkedList < Produto > searched, int barCodeToSearch ) {
		
		for ( int index = 0; index < searched.size(); index++ ) {
			
			if ( searched.get ( index ).getBarCode() == barCodeToSearch ) {
				
				System.out.println ( "Bar Code " + barCodeToSearch + " was found at :" + index );
				return true;
			}
		}
		
		System.out.println ( "Bar Code " + barCodeToSearch + " was not found" );
		return false;
	}
	
	public static void InflateProductList ( Produto p ) {
		
		if ( SimpleSearch ( produtos, ( Produto ) p ) ) {
			
			produtos.add ( p.Clone () );
			
			Produto temp = p.Clone();
			temp.setBarCode ( p.getBarCode() + 10 );
			produtos.add ( temp );
		}
	}
}
