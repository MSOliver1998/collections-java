package set.ordenacao.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProdutos {

    private Set<Produto> produtos;

    public CadastroDeProdutos(){
        this.produtos=new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, Double preco, int quantidade){
        produtos.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto> exibirPorNome(){
        Set<Produto> produtosPorNome= new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco= new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtos);
        return produtoPorPreco;
    }

    public static void main(String[] args){
        CadastroDeProdutos produtosLista= new CadastroDeProdutos();

        produtosLista.adicionarProduto(1, "furadeira" ,199.98, 5);
        produtosLista.adicionarProduto(2, "broca 6" ,2.98, 38);
        produtosLista.adicionarProduto(3, "broca 8" ,2.98, 28);
        produtosLista.adicionarProduto(4, "broca 10" ,3.98, 18);
        produtosLista.adicionarProduto(5, "ladrilho" ,19.98, 5);
        produtosLista.adicionarProduto(6, "disco de serra" ,50.98, 9);
        produtosLista.adicionarProduto(7, "furadeira" ,170.98, 10);


        System.out.println(produtosLista.exibirPorNome());
        System.out.println(produtosLista.exibirPorPreco());

    }
}
