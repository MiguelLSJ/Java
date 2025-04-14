package Lista04;
import java.util.Scanner;

public class ContaBancaria {
    Scanner li = new Scanner(System.in);
    String titular;
    float saldo;

    void quest () {
        System.out.print ("Digite o titular: ");
        titular = li.next ();
        System.out.print ("Digite o saldo: R$ ");
        saldo = li.nextFloat ();
    }
}
