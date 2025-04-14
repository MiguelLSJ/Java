package Lista04;

public class ContaCorrente extends ContaBancaria{
    float limite = 20000;

    void list () {
        System.out.format ("Nome: %s\nSaldo: R$ %.2f\nLimite: R$ %.2f\n", titular, saldo, limite);
    }
}
