package Lista04;

public class PagCartao extends Pagamento{
    int numCar;

    @Override
    void quest () {
        super.quest();

        if (z == 1) {
            System.out.print ("Informe o número do cartão: ");
            numCar = li.nextInt();

            System.out.print ("\nPagamento realizado com sucesso. . .\n");
        } else if (z == 2) {
            System.out.print ("\nPagamento não realizado. . .\n");
        }


    }
}
