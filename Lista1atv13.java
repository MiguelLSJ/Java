package Lista01;

import java.util.Scanner;

public class Lista1atv13 {
    public static void main (String[] args) {

        Scanner le = new Scanner(System.in);

        System.out.print("Digite o 1º número\n--> ");
        float num1 = le.nextFloat();
        System.out.print("Digite o 2º número\n--> ");
        float num2 = le.nextFloat();
        System.out.print("Digite o 3º número\n--> ");
        float num3 = le.nextFloat();

        if (num1 > num2 && num2 > num3) {
            System.out.format ("Maior: %.1f\nMenor: %.1f\n", num1, num3);
        } else { //terminar depois. . .
            if (num2 > num1) {
                System.out.format ("O número %.1f é maior que o número %.1f\n\n", num2, num1);
            } else {
                System.out.format ("Os números %.1f e %.1f são iguais\n\n", num1, num2);
            }
        }
    }
}
