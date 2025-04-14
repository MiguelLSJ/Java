package Lista04;
import java.util.Scanner;

public class Pagamento {
    Scanner li = new Scanner (System.in);
    float valor = 50;
    int z;

    void quest () {
         System.out.format ("\nValor da compra: R$ %.2f \nEscolha\n 1 . Pagamento com cartão\n 2 . Pagamento com boleto\n---> ", valor);
         z = li.nextInt ();

        if (z == 1) {
            System.out.print ("Informe o número do cartão: ");
            //numCar = li.nextInt();

            System.out.print ("\nPagamento realizado com sucesso. . .\n");
        } else if (z == 2) {

            System.out.print ("Código de barras: ");

        }
    }
}
