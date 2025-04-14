package Lista01;

public class Lista1atv25 {
    public static void main (String[] args) {
        java.util.Scanner le = new java.util.Scanner (System.in);
        int tempo = 1, cal = 0;

        do {
            System.out.print ("Digite um número ou digite 0 para finalizar: ");
            tempo = le.nextInt ();

            cal += tempo;
        } while (tempo != 0);

        System.out.format ("O resultado da soma dos itens é: %d\n\n", cal);
    }
}
