package heranca2_izabela;

public class MaquinaA extends Maquina {
	private double custo1Prod2;
	private double custo2Prod2;
	private double tempoProd2;
	
	public MaquinaA(double custo1Prod1, double custo2Prod1, double tempoProd1, double custo1Prod2, double custo2Prod2, double tempoProd2) {
		super(custo1Prod1, custo2Prod1, tempoProd1);
		this.custo1Prod2 = custo1Prod2;
		this.custo2Prod2 = custo2Prod2;
		this.tempoProd2 = tempoProd2;
	}

	public void setCusto1Prod2(double c1p2){
		this.custo1Prod2 = c1p2;
	}
	
	public double getCusto1Prod2(){
		return this.custo1Prod2;
	}
	
	public void produzirP1(int p) {
		custo = getCusto1Prod1() + getCusto2Prod1() * p;
		System.out.printf("Custo produção P1: " + custo);
		tempo = getTempoProd1() * p;
		System.out.printf("\nTempo produção P1: " + tempo);
	}
	
	public void produzirP2(int p2) {
		custo = custo1Prod2 + custo2Prod2 * p2;
		System.out.printf("Custo produção P2: " + custo);
		tempo = tempoProd2 * p2;
		System.out.printf("\nTempo produção P2: " + tempo);
	}
	
	public void produzirT(int p1, int p2){
			produzirP1(p1);
			produzirP2(p2);
	}
}
