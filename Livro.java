package Lista02;

import java.util.Scanner;

public class Livro {
    String titulo, autor;
    int anoP;
    Scanner le = new Scanner(System.in);

    void exibirInfo () {
        System.out.format ("Titulo: %s\nAutor: %s\nAno de Publicação: %d\n", titulo, autor, anoP);
    }

    void quest () {
        System.out.print ("Digite o nome do livro\n---> ");
        titulo = le.next();
        System.out.print ("Digite o nome do autor\n---> ");
        autor = le.next();
        System.out.print ("Digite o ano de publicação do livro\n---> ");
        anoP = le.nextInt();
    }

    static public void main (String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.quest();
        livro2.quest();
        livro3.quest();

        livro1.exibirInfo();
        livro2.exibirInfo();
        livro3.exibirInfo();
    } //Lista 2 exe 9
}
