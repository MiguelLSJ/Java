package Lista04;

public class Gato extends Animal {

    @Override
    void fazerSom () {
        super.fazerSom();
        System.out.format ("\n%s", som = "Miau");
    }
}
