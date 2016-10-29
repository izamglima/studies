package heranca2_izabela;

public class Maquina {
	private double custo1Prod1;
	private double custo2Prod1;
	private double tempoProd1;
	protected double custo, tempo;
	
	public Maquina(double custo1Prod1, double custo2Prod1, double tempoProd1) {
		this.custo1Prod1 = custo1Prod1;
		this.custo2Prod1 = custo2Prod1;
		this.tempoProd1 = tempoProd1;
	}
	
	public void setCusto1Prod1(double c1p1){
		this.custo1Prod1 = c1p1;
	}
	
	public double getCusto1Prod1(){
		return this.custo1Prod1;
	}
	
	public void setCusto2Prod1(double c2p1){
		this.custo2Prod1 = c2p1;
	}
	
	public double getCusto2Prod1(){
		return this.custo2Prod1;
	}
	
	public void setTempoProd1(double t1){
		this.custo2Prod1 = t1;
	}
	
	public double getTempoProd1(){
		return this.custo2Prod1;
	}
		
	
	public void produzirP1(int p) {
		custo = custo1Prod1 + custo2Prod1 * p;
		System.out.printf("Custo produção P1: " + custo);
		tempo = tempoProd1 * p;
		System.out.printf("\nTempo produção P1: " + tempo);
	}
	
	
}
