package Lista04;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner le = new Scanner(System.in);
        int i, x;

        do {
            System.out.print ("Digite o número da atividade (0 para encerrar): ");
            i = le.nextInt ();

            switch (i) {
                case 0: {
                    break;
                }
                case 1: {
                    Moto motos = new Moto ();
                    Carro carros = new Carro ();

                    System.out.print("Digite a marca e o modelo do carro:\nMarca: ");
                    carros.marca = le.next ();
                    System.out.print("Modelo: ");
                    carros.modelo = le.next ();
                    System.out.print("Digite o preço do carro: R$ ");
                    carros.precoC = le.nextFloat ();

                    System.out.print("Digite a marca e o modelo da moto:\nMarca: ");
                    motos.marca = le.next ();
                    System.out.print("Modelo: ");
                    motos.modelo = le.next ();
                    System.out.print("Digite o preço da moto: R$ ");
                    motos.precoM = le.nextFloat ();

                    carros.exbInfo();
                    carros.exbPrecC();
                    motos.exbInfo();
                    motos.exbPrecM();
                    break;
                }

                case 2: {
                    Gerente gerente = new Gerente();
                    Estagiario estagiario = new Estagiario();

                    gerente.quest();
                    gerente.list();

                    estagiario.quest();
                    estagiario.list();

                    System.out.print("\n");
                    break;
                }

                case 3: {
                    Gato gato = new Gato ();
                    Cachorro cao = new Cachorro();

                    gato.fazerSom();
                    cao.fazerSom();
                    System.out.print ("\n\n");
                    break;
                }

                case 4: {
                    ContaCorrente cc = new ContaCorrente();
                    ContaPoupanca cp = new ContaPoupanca();

                    cc.quest();
                    cc.list();

                    cp.quest();
                    cp.list();
                    break;
                }

                case 5: {
                    Retangulo reto = new Retangulo();
                    Circulo ci = new Circulo();

                    System.out.print ("\nEscolha:\n    1. Área do Retângulo\n    2. Área do Círculo\n---> ");
                    x = le.nextInt();

                    if (x == 1) {
                        reto.calcArea();
                        reto.impr();
                    } else if (x == 2) {
                        ci.calcArea();
                        ci.impr();
                    } else {
                        System.out.print ("\n\nInválido\n\n");
                    }
                    break;
                }

                case 6: {
                    PagCartao cart = new PagCartao();
                    PagBole bol = new PagBole();

                    cart.quest();
                    bol.quest();

                    break;
                }

                default: {
                    System.out.format ("%d Não é um valor permitido.");
                    break;
                }
            }

        } while (i != 0);
    }
}
