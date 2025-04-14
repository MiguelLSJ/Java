package Lista01;

import java.util.Scanner;

public class Lista1atv1 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.print ("Digite um número: ");
        int num = leitor.nextInt ();

        System.out.format ("Número digitado: %d ", num);
    }
}
