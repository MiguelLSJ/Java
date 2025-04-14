package Lista04;

public class Estagiario extends Funcionario {
    int cargHo;

    @Override
    void quest() {
        super.quest();
        System.out.print ("Digite a carga horária: ");
        cargHo = li.nextInt();
        System.out.print ("\n");
    }

    @Override
    void list() {
        super.list();
        System.out.format ("Quantidade de horas trabalhadas: %d", cargHo);
    }
}