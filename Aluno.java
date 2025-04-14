package ATV_avaliativa_1;
import java.util.Scanner;

public class Aluno {
    private String nome, matricula;
    private double nota;

    public String getNome () {
        return nome;
    }

    public void setNome (String name) {
        this.nome = name;
    }

    public String getMatricula () {
        return matricula;
    }

    public void setMatricula (String matr) {
        this.matricula = matr;
    }

    public double getNota () {
        return nota;
    }

    public void setNota (double nata) {
        this.nota = nata;
    }
}
