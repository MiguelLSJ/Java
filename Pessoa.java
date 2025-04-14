package Lista02;

public class Pessoa {
    String nome;
    int idade;

    void exibirDados () {
        System.out.format ("Nome: %s\n", nome);
        System.out.format ("Idade: %d\n", idade);
    }

    void exibirIdade () {
        System.out.format ("Idade: %d\n", idade);
    }

    void fazAniver () {
        System.out.format ("'Mensagem do Sistema' Feliz aniversário %s\n", nome);
        idade += 1;
    }

    public static void main (String[] args) {
        Pessoa gente = new Pessoa();

        gente.nome = "Robertinho dos Mares";
        gente.idade = 17;

        gente.exibirDados();
        gente.fazAniver();
        gente.exibirIdade();

        // Lista 2 exe 4-5.
    }
}
