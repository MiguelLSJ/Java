package Lista01;

import java.util.Scanner;

public class Lista1atv3 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.print ("Digite o 1º valor: ");
        int val1 = leitor.nextInt ();

        System.out.print ("Digite o 2º valor: ");
        int val2 = leitor.nextInt ();

        leitor.close();

        int resultado = val1 + val2;
        System.out.format("Resultado: %d ", resultado);
    }
}
