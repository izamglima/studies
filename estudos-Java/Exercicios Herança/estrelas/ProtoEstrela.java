package herenca2_izabela;

public class ProtoEstrela {
	private double temperatura;
	private double magnitude;
	private double luminosidade;
	
	public void setTemperatura(double temp){
		this.temperatura = temp;
	}
	
	public double getTemperatura() {
		return this.temperatura;
	}
	
	public void setMagnitude(double mag) {
		this.magnitude = mag;
	}
	
	public double getMagnitude() {
		return this.magnitude;
	}
	
	public void setLuminosidade(double lum) {
		this.luminosidade = lum;
	}
	
	public double getLuminosidade(){
		return this.luminosidade;
	}
	
	public ProtoEstrela(double temperatura, double magnitude, double luminosidade) {
		this.temperatura = temperatura;
		this.magnitude = magnitude;
		this.luminosidade = luminosidade;
	}
	
	public ProtoEstrela() {
		this(0.0, 0.0,0.0);
	}
	
	public String mostrarTipo() {
			return this.getClass().getSimpleName();
	}
	
	public String mostrarDados() {
		return "\nNome: " + this.mostrarTipo() + "\nTemperatura: " + this.temperatura + "\nMagnitude: " + this.magnitude + "\nLuminosidade: " + this.luminosidade;
	}
	
}
