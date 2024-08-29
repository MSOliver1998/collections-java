package list.ordenacao.ordenacaoDePessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    
    private String nome;
    private int idade;
    private Double altura;

    public Pessoa(String nome,int idade ,Double altura ){
        this.nome=nome;
        this.idade=idade;
        this.altura=altura;
    }

    public Double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " " + idade + " "+ altura;
    }

    @Override
    public int compareTo(Pessoa p){
        return Integer.compare(idade, p.getIdade());
    }

}

class ComparatorPorAltura implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
      return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
