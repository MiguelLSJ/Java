package Lista01;

public class Lista1atv24 {
    public static void main (String[] args) {
        java.util.Scanner le = new java.util.Scanner (System.in);
        int i, cal = 0;
        int nums [];

        nums = new int [5];

        for (i = 0; i < 5; i++) {
            System.out.format ("Digite o %dº valor: ", i + 1);
            nums [i] = le.nextInt();
            cal += nums [i];
            if (i == 4) {
                cal = cal / 5;
            }
        }

        System.out.format ("A média dos valores é: %d\n", cal);
    }
}
