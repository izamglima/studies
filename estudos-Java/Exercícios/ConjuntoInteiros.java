import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoInteiros {
    Boolean[] lista = new Boolean[101];

    public ConjuntoInteiros() {
        for(int i = 0; i <= 100; i++) {
            lista[i] = false;
        }
    }

    public void insereElemento(int k){
        lista[k] = true;
    }

    public void deletaElemento(int m){
        lista[m] = false;
    }

    public void uniao(Boolean[] a, Boolean[] b){
        ConjuntoInteiros c = new ConjuntoInteiros();
        for(int i = 0; i <= 100; i++) {
            if(a[i] | a[i]) {
                c.insereElemento(i);
            } else if (a[i] | a[i] == false) {
                c.deletaElemento(i);
            } else {
                c.insereElemento(i);
            }
            System.out.println("Elemento["+i+"] " +lista[i]);
        }

    }

    public void intersecao(Boolean[] a, Boolean[] b) {
        ConjuntoInteiros c = new ConjuntoInteiros();
        for(int i = 0; i <= 100; i++){
            if(a[i] && a[i]) {
                c.insereElemento(i);
            } else {
                c.deletaElemento(i);
            }
        }
    }

    public void eIgualA(Boolean[] a, Boolean[] b){
        Boolean igual = true;
        for(int i = 0; i <= 100; i++) {
            if(a[i] != a[i]) {
                igual = false;
            }
        }
        if (igual == true) {
            System.out.println("\nOs conjuntos são iguais!");
        } else {
            System.out.println("\nOs conjuntos não são iguais!");
        }

    }
}
