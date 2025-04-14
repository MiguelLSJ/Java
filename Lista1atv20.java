package Lista01;

public class Lista1atv20 {
    public static void main (String[] args) {
        java.util.Scanner le = new java.util.Scanner (System.in);
        int i, x;

        System.out.print ("Digite um número: ");
        x = le.nextInt ();

        for (i = 0; i <= x; i++) {
            System.out.format ("%d ", i);
            if ((i % 10) == 0) {
                System.out.print("\n");
            }
        }
    }
}
