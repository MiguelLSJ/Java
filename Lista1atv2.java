package Lista01;

import java.util.Scanner;

public class Lista1atv2 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);

        System.out.print ("Digite o seu nome: ");
        String nome = leitor.next ();

        System.out.format("Boas vindas %s ", nome);
    }
}
