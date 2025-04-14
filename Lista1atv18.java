package Lista01;

public class Lista1atv18 {
    public static void main (String[] args) {
        int i;
        for (i = 1; i < 21; i++) {
            if ((i % 2) != 0) {
                System.out.format ("%d ", i);
                if (i == 19) {
                    System.out.print ("\n");
                }
            }
        }
    }
}