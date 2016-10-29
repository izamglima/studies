/**
 * Created by aluno on 21/06/2016.
 */
public class Motor {
    public String ligado;
    public int tempomax;

    public Motor(){
        this.ligado = "desligado";
        this.tempomax = 10;
    }

    public void Ligar() {
        this.ligado = "ligado";
    }

    public void Desligar() {
        this.ligado = "desligado";
    }

}
