package Lista01;

import java.util.Scanner;

public class Lista1atv11 {
    public static void main (String[] args) {

        Scanner le = new Scanner(System.in);
        String tipo;

        System.out.print("Digite um número\n--> ");
        float num = le.nextFloat();

        if ((num % 2) == 0) {
            tipo = "PAR";
        } else {
            tipo = "ÍMPAR";
        }

        System.out.format("O número %.1f é %s\n\n", num, tipo);
    }
}
