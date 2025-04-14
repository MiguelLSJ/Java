package Lista02;

import java.util.Scanner;

public class Carro {
    String marca;
    String modelo;
    int ano;

    void exibirDados () {
        System.out.format ("Marca: %s\n", marca);
        System.out.format ("Modelo: %s\n", modelo);
        System.out.format ("Ano: %d\n", ano);

    }

    public Carro (String mark, String model, int year) {
        this.marca = mark;
        this.modelo = model;
        this.ano = year;
    }

    public static void main (String[] args) {
        Carro carro = new Carro("Place Holder", "Place Holder", 1886);
        Carro veiculo = new Carro ("Place Holder", "Place Holder", 1886);
        Scanner leitor = new Scanner(System.in);

        System.out.println ("Informe a marca do veículo:");
        System.out.print ("---> ");
        carro.marca = leitor.nextLine ();
        System.out.println ("Informe o modelo do veículo:");
        System.out.print ("---> ");
        carro.modelo = leitor.nextLine ();
        System.out.println ("Informe o ano do veículo:");
        System.out.print ("---> ");
        carro.ano = leitor.nextInt();

        carro.exibirDados();
        veiculo.exibirDados();
        //Lista 2 atividade 1-3.
    }
}

