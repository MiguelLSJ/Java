package Lista04;

public class Retangulo extends Forma {
    float base, altura, total;

    @Override
    void calcArea() {
        super.calcArea();
        System.out.print ("Informe a base: ");
        base = li.nextFloat();
        System.out.print ("Informe a altura: ");
        altura = li.nextFloat();
        total = base * altura;
    }

    void impr () {
        System.out.format ("\nA área do retângulo é: %.2f\n", total);
    }
}
