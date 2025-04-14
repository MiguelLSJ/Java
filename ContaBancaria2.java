package Lista03;

public class ContaBancaria2 {
    private String titular, numConta;
    private float saldo;

    public void depositarVal (float quantidade) {
        saldo += quantidade;
    }
}
