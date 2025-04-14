package Lista04;

public class PagBole extends Pagamento {
    int codBarras;

    @Override
    void quest () {
        super.quest();

        if (z == 2) {
            System.out.print ("Informe o código de barras: ");
            codBarras = li.nextInt();

            System.out.print ("\nPagamento realizado com sucesso. . .\n");
        } else if (z == 1) {
            System.out.print ("\nPagamento não realizado. . .\n");
        }
    }
}
