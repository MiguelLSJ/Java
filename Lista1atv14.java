package Lista01;

import java.util.Scanner;

public class Lista1atv14 {
    public static void main (String[] args) {

        Scanner le = new Scanner(System.in);
        String tipo;

        System.out.print("Digite a sua idade\n---> ");
        int idd = le.nextInt();

        if (idd >= 18) {
            System.out.print("Você é maior de idade\n");
        } else {
            System.out.print("Você é menor de idade\n");
        }
    }
}
