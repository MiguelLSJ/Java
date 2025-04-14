package Lista01;

public class Lista1atv21 {
    public static void main (String[] args) {
        int i, cal = 0;

        for (i = 1; i < 101; i++) {
            cal += i;
        }

        System.out.format ("A soma de todos os números de 1 a 100 é igual a: %d\n", cal);
    }
}
