/**
 * Created by aluno on 21/06/2016.
 */
import java.util.Timer;
import java.util.TimerTask;

public class Switcher {
    Timer timer;
    Motor m = new Motor();

    public Switcher(int segundos) {
        System.out.println("\nMotor ligado");
        m.Ligar();
        timer = new Timer();
        timer.schedule(new Teste(), segundos*1000);

    }

    class Teste extends TimerTask {
        public void run(){
            System.out.println("\nMotor desligado");
            m.Desligar();
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        new Switcher(10);
        System.out.println("\nComeçando a contar");
    }
}
