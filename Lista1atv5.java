package Lista01;

import java.util.Scanner;

public class Lista1atv5 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.print ("Digite 1 valor: ");
        int val1 = leitor.nextInt ();

        int mai = val1 + 1;
        int men = val1 - 1;

        System.out.format("O sucessor e o antecessor de %d são: %d e %d ", val1, mai, men);
    }
}