package Lista04;

public class Gerente extends Funcionario {
    float bonus;
    float cal;

    @Override
    void quest() {
        super.quest();
        System.out.print ("Digite o valor do bônus: ");
        bonus = li.nextFloat();
        cal = salario + (salario * (bonus / 100));
        System.out.print ("\n");
    }

    @Override
    void list() {
        super.list();
        System.out.format ("Salário com bônus: R$ %.2f\n", cal);
    }
}