package Lista04;

public class ContaPoupanca extends ContaBancaria {
    float rendimento = 8, cal;

    void list () {
        System.out.format ("Nome: %s\nSaldo: R$ %.2f\nRendimeto: 0.%.0f porcento\n", titular, saldo, rendimento );
    }
}
