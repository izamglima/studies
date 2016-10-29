package exercicios_izabela;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {
	private String nome;
	private double saldo;
	Date dataInicio = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	
	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		//this.dataInicio = sdf.format(dataInicio.getTime());
	}
	
	int i = 1;
	public void MostrarInfos(int i) {
		System.out.printf("Conta simples número %d  Titular: %s  Saldo: %.2f \n", i, this.nome, this.saldo);
	}
	
}
