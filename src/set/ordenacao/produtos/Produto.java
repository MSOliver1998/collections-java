package set.ordenacao.produtos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade){
        this.nome=nome;
        this.cod=cod;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCod(long cod) {
        this.cod = cod;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getCod() {
        return cod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return this.quantidade + " " + this.nome + " "+ this.cod + " " + this.preco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Produto produto)){
            return false;
        }
        return getCod()==produto.getCod();
    }

    @Override
    public int compareTo(Produto o) {

        return nome.compareToIgnoreCase(o.getNome());
    }
       
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
    
}
