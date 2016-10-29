/**
 * Created by aluno on 21/06/2016.
 */
public class TesteMain {
    public static void main (String[] args) {
        //inicializa
        ConjuntoInteiros cjt = new ConjuntoInteiros();

        System.out.println("\n=== Lista criada: ===");
        for(int i = 0; i <= 100; i++) {
            System.out.println( cjt.lista[i] );
        }

        //insere true
        cjt.insereElemento(0);
        cjt.insereElemento(4);
        cjt.insereElemento(7);
        cjt.insereElemento(9);
        cjt.insereElemento(13);
        cjt.insereElemento(5);
        cjt.insereElemento(33);
        cjt.insereElemento(55);
        cjt.insereElemento(22);
        cjt.insereElemento(99);
        cjt.insereElemento(42);
        cjt.insereElemento(68);
        cjt.insereElemento(32);

        System.out.println("\n=== Adicionados trues: ===");
        System.out.println("Elemento 4 " + cjt.lista[4] );
        System.out.println("Elemento 7 " + cjt.lista[7] );
        System.out.println("Elemento 13 " +cjt.lista[13] );

        //deleta
        cjt.deletaElemento(5);


        System.out.println("\n=== Deletado: ===");
        System.out.println("Elemento 5 " + cjt.lista[5] );

        //inicializa segundo objeto
        ConjuntoInteiros cjt2 = new ConjuntoInteiros();

        //insere true
        cjt2.insereElemento(0);
        cjt2.insereElemento(4);
        cjt2.insereElemento(5);
        cjt2.insereElemento(6);
        cjt2.insereElemento(7);
        cjt2.insereElemento(13);
        cjt2.insereElemento(55);
        cjt2.insereElemento(21);
        cjt2.insereElemento(68);
        cjt2.insereElemento(22);


        System.out.println("\n=== União de dois conjuntos: ===");
        cjt.uniao(cjt.lista, cjt2.lista);
    }
}
