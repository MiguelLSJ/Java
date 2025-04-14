package Lista01;

import java.util.Scanner;

public class Lista1atv7 {

    public static void main (String[] args) {

        Scanner le = new Scanner (System.in);

        System.out.print ("Digite o valor\n--> R$ ");
        float num = le.nextFloat();

        System.out.format("R$ %.2f são equivalentes a R$ %.2f doláres\n\n", num, num / 5.77);
    }
}
