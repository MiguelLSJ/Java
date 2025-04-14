package Lista02;

import java.util.Scanner;

public class Produto {
    private String nome;
    private float preco;

    public String getNome (){
        return nome;
    }

    public void setNome (String nomeTempo){
        this.nome = nomeTempo;
    }
    public float getPreco (){
        return preco;
    }

    public void setPreco (float custo){
        this.preco = custo;
    }

    public void aplicarDesconto (float percentual) {
        setPreco(getPreco() - (getPreco() * (percentual / 100)));
    }

    public static void main (String[] args){
        Produto item = new Produto ();
        Produto thing = new Produto ();
        Scanner leitor = new Scanner (System.in);

        System.out.print ("Digite o nome do 1º Lista02.Produto\n---> ");
        String tempotxt = leitor.next();;
        item.setNome(tempotxt);
        System.out.print ("Digite o preço do 1º Lista02.Produto\n---> R$ ");
        float tempoflo = leitor.nextFloat();
        item.setPreco(tempoflo);

        System.out.print ("Digite o nome do 2º Lista02.Produto\n---> ");
        tempotxt = leitor.next();;
        thing.setNome(tempotxt);
        System.out.print ("Digite o preço do 2º Lista02.Produto\n---> R$ ");
        tempoflo = leitor.nextFloat();
        thing.setPreco(tempoflo);

        System.out.print ("Digite o valor do desconto do produto nº 1\n---> ");
        int tempoperc = leitor.nextInt();
        item.aplicarDesconto(tempoperc);

        System.out.print ("Digite o valor do desconto do produto nº 2\n---> ");
        tempoperc = leitor.nextInt();;
        thing.aplicarDesconto(tempoperc);

        System.out.println(item.getNome());
        System.out.println(item.getPreco());
        System.out.println(thing.getNome());
        System.out.println(thing.getPreco());
    } //Lista 2 exe 6-7
}
