package Lista01;

import java.util.Scanner;

public class Lista1atv8 {

    public static void main (String[] args) {

        Scanner le = new Scanner (System.in);

        System.out.print ("Digite um número\n--> ");
        float num = le.nextFloat();

        System.out.format("%.0f^2 = %.0f\n%.0f^3 = %.0f\n\n", num, java.lang.Math.pow(num, 2), num, java.lang.Math.pow(num, 3));
    }
}
