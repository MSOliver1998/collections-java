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
        return nome +" " +preco+ " "+quantidade;
    }
}
