package Lista02;

import java.util.Scanner;

public class ContaBancaria {
    String titular, numConta;
    float saldo;

    public void depositarVal (float quantidade) {
        saldo += quantidade;
    }

    public void sacarVal (float quantia) {
        saldo -= quantia;
    }

    public static void main (String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner le = new Scanner(System.in);
        int esc;

        System.out.print("Digite o nome\n---> ");
        conta.titular = le.next();
        System.out.print("Digite o número da conta\n---> ");
        conta.numConta = le.next();

        do {
            System.out.print("Digite 1 para DEPOSITAR, 2 para SACAR e 3 para SAIR\n---> ");
            esc = le.nextInt ();

            switch (esc) {
                case 1: {
                    System.out.print("Digite o valor do depósito\n---> R$ ");
                    float val = le.nextFloat();
                    conta.depositarVal(val);
                    break;
                }
                case 2: {
                    System.out.print("Digite o valor do saque\n---> R$ ");
                    float val = le.nextFloat();
                    conta.sacarVal(val);
                }
                case 3: {
                    break;
                }
                default: {
                    System.out.println ("Opção inválida");
                }
            }
        } while (esc != 3);

        System.out.format("Titular: %s\nNúmero da conta: %s\nSaldo: %.2f\n", conta.titular, conta.numConta, conta.saldo);;
    } //Lista 2 exe 8
}
