package Lista03;

import java.util.Scanner;

public class Pessoa2 {
    private String nome;
    private int idade;

    public String getNome () {
        return nome;
    }

    public void setNome (String name) {
        this.nome = name;
    }

    public int getIdd () {
        return idade;
    }

    public void setIdd (int idd) {
        Scanner erro = new Scanner(System.in);
        if (idd > 0) {
            this.idade = idd;
        } else {
            System.out.format ("\nA idade %d não é Permitida. . .\n---> ", idd);
        }
    }

    public static void main (String[] args) {
        Pessoa2 gente1 = new Pessoa2 ();
        Scanner le = new Scanner (System.in);

        System.out.print ("Informe o nome\n--> ");
        gente1.setNome(le.next());
        System.out.print ("Informe a idade\n--> ");
        gente1.setIdd(le.nextInt());
        if (gente1.getIdd() == 0) {
            do {
                gente1.setIdd(le.nextInt());
            } while (gente1.getIdd() == 0);
        }

        System.out.format ("Nome: %s\nIdade: %d\n", gente1.getNome(), gente1.getIdd());
        //lista 3 atv 1 - 2
    }
}
