package Lista01;

import java.util.Scanner;

public class Lista1atv6 {

    public static void main (String[] args) {

        Scanner le = new Scanner (System.in);

        System.out.print ("Digite um número\n--> ");
        float num = le.nextInt();

        System.out.format("Dobro: %.1f\nTriplo: %.1f\nRaiz: %.2f\n", num * 2, num * 3, java.lang.Math.sqrt (num));
    }
}
