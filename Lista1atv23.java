package Lista01;

public class Lista1atv23 {
    public static void main (String[] args) {
        java.util.Scanner le = new java.util.Scanner (System.in);
        int i, cal = 0;
        int nums [];

        nums = new int [10];

        for (i = 0; i < 10; i++) {
            System.out.format ("Digite o %dº valor: ", i + 1);
            nums [i] = le.nextInt();
            cal += nums [i];
        }

        System.out.format ("A soma dos números é: %d\n", cal);
    }
}
