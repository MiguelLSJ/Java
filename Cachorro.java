package Lista04;

public class Cachorro extends Animal{

    @Override
    void fazerSom () {
        super.fazerSom();
        System.out.format ("\n%s", som = "Au");
    }
}
