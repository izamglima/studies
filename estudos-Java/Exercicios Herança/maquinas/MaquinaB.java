package heranca2_izabela;

public class MaquinaB extends Maquina {
	private double custo1Prod3;
	private double custo2Prod3;
	private double tempoProd3;
	
	public MaquinaB(double custo1Prod1, double custo2Prod1, double tempoProd1, double custo1Prod3, double custo2Prod3, double tempoProd3) {
		super(custo1Prod1, custo2Prod1, tempoProd1);
		this.custo1Prod3 = custo1Prod3;
		this.custo2Prod3 = custo2Prod3;
		this.tempoProd3 = tempoProd3;
	}
	
	public void setCusto1Prod3(double c1p3){
		this.custo1Prod3 = c1p3;
	}
	
	public double getCusto2Prod3(){
		return this.custo2Prod3;
	}
	
	public void produzirP1(int p) {
		custo = getCusto1Prod1() + getCusto2Prod1() * p;
		System.out.printf("Custo produção P1: " + custo);
		tempo = getTempoProd1() * p;
		System.out.printf("\nTempo produção P1: " + tempo);
	}
	
	public void produzirP3(int p3) {
		custo = custo1Prod3 + custo2Prod3 * p3;
		System.out.printf("Custo produção P3: " + custo);
		tempo = tempoProd3 * p3;
		System.out.printf("\nTempo produção P3: " + tempo);
	}
	
	public void produzirT(int p1, int p3){
			produzirP1(p1);
			produzirP3(p3);
	}
	
}
