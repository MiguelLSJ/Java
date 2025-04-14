package Lista01;

import java.util.Scanner;

public class Lista1atv9 {

    public static void main (String[] args) {

        java.util.Scanner le = new Scanner (System.in);

        System.out.print ("Digite o 1º número\n--> ");
        float num1 = le.nextFloat();
        System.out.print ("Digite o 2º número\n--> ");
        float num2 = le.nextFloat();

        float mai, men;

        if (num1 > num2) {
            mai = num1;
            men = num2;
            System.out.format("Maior: %.1f\nMenor: %.1f\n\n", mai, men);
        } else {
            if (num2 > num1) {
                mai = num2;
                men = num1;
                System.out.format("Maior: %.1f\nMenor: %.1f\n\n", mai, men);
            }
        }
        if (num1 == num2){
            System.out.print ("Números iguais.\n\n");
        }
    }
}
