package Lista04;

public class Circulo extends Forma{
    float raio;
    double total;

    @Override
    void calcArea() {
        super.calcArea();
        System.out.print ("Informe o raio: ");
        raio = li.nextFloat();
        total = (raio * raio) * 3.14;
    }

    void impr () {
        System.out.format ("\nA área do circulo é: %.2f\n", total);
    }
}
