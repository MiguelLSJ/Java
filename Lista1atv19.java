package Lista01;

public class Lista1atv19 {
    public static void main (String[] args) {
        java.util.Scanner le = new java.util.Scanner (System.in);
        int i, x, cal;

        System.out.print ("Digite um número: ");
        x = le.nextInt ();

        for (i = 1; i < 11; i++) {
            cal = x * i;
            System.out.format ("%d * %d = %d\n", x, i, cal);
        }
    }
}
