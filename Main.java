package ATV_avaliativa_1;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner le = new Scanner (System.in);
        int i;
        do {
            System.out.print ("      Menu      \n   1 . Cadastrar Aluno\n   2 . Editar Aluno\n   3 . Listar Alunos\n   4 . Sair\n   ---> ");
            i = le.nextInt ();

            switch (i) {
                case 4: {
                    System.out.print ("Saindo. . .");
                    break;
                }

                default :{
                    System.out.print ("Inválido\n");
                    break;
                }
            }
        } while (i != 4);
    }
}