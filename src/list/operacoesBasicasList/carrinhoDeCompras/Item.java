package list.operacoesBasicasList.carrinhoDeCompras;

public class Item {
    
    private String nome;
    private int quantidade;
    private Double preco;

    public Item(String nome, int quantidade, Double preco){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    public String getName(){
        return this.nome;
    }

    public Double getPrice(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public String toString() {
        return this.quantidade + " " +  this.nome +" R$:" +String.format("%.2f",this.preco) + " total R$: " + String.format("%.2f", this.quantidade*this.preco);
    }
}
