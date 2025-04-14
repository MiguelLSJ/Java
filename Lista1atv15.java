package Lista01;

import java.util.Scanner;

public class Lista1atv15 {

    public static void main (String[] args) {
        Scanner le = new Scanner(System.in);
        int senha = 1234;
        int senhaU;

        System.out.print("Digite a senha\n---> ");
        senhaU = le.nextInt();

        if (senhaU != senha) {
            System.out.print("Acesso Negado\n");
        } else {
            System.out.print ("Acesso Garantido\n");
        }
    }
}
