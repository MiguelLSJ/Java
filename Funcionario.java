package Lista04;
import java.util.Scanner;

public class Funcionario {
    String nome;
    float salario;
    Scanner li = new Scanner (System.in);

    void quest () {
        System.out.print("Digite o nome: ");
        nome = li.next();
        System.out.print("Digite o salário: R$ ");
        salario = li.nextFloat();
    }

    void list () {
        System.out.format ("Nome: %s\nSalário: R$ %.2f\n", nome, salario);
    }
}
