package Lista01;

import java.util.Scanner;

public class Lista1atv10 {

    public static void main (String[] args) {

        Scanner le = new Scanner (System.in);
        String tipo;

        System.out.print ("Digite um número\n--> ");
        float num = le.nextFloat();

        if (num >= 0) {
            tipo = "POSITIVO";
        } else {
            tipo = "NEGATIVO";
        }

        System.out.format("O número %.1f é %s\n\n", num, tipo);
    }
}
