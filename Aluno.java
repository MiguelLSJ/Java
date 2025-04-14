package Lista02;

import java.util.Scanner;

public class Aluno {
    String nome;
    float nt1, nt2;
    Scanner le = new Scanner(System.in);

    float calcM () {
        float total = (nt1 + nt2) / 2;
        return total;
    }

    void verApro () {
        if (calcM() >= 7) {
            System.out.format("O aluno %s foi aprovado com média final: %.1f\n", nome, calcM());
        } else {
            System.out.format("O aluno %s foi reprovado com média final: %.1f\n", nome, calcM());
        }
    }

    void quest () {
        System.out.print("Digite o nome do aluno\n---> ");
        nome = le.next ();
        System.out.print("Digite a 1ª nota\n--> ");
        nt1 = le.nextFloat ();
        System.out.print("Digite a 2ª nota\n--> ");
        nt2 = le.nextFloat ();

        verApro();
    }

    public static void main (String[] args) {

        Aluno criatura = new Aluno();

        criatura.quest();
    } // Lista 2 exe 10
}
