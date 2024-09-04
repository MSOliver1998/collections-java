package map.pesquisa.estoque;

import java.util.Map;
import java.util.HashMap;

public class EstoqueDeProdutos {
    
    private Map<Long,Produto> estoque;

    public EstoqueDeProdutos(){
        this.estoque=new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade,double preco){
        estoque.put(cod,new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        if(estoque.isEmpty()==false){
            System.out.println(estoque);
        }else{
            System.out.println("estoque vazio");
        }
    }

    public Double valorEmEstoque(){
        double total=0;
        if(estoque.isEmpty()==false){
            for(Produto produto : estoque.values()){
                int quantidade=produto.getQuantidade();
                double preco= produto.getPreco();

                total+= quantidade*preco;
            }
        }
        return total;
    }

    public Produto produtoMaisCaro(){
        Produto maisCaro=null;
        double valor= Double.MIN_VALUE;
        if(estoque.isEmpty()==false){
            for(Produto produto: estoque.values()){
                if(produto.getPreco()>valor){
                    maisCaro=produto;
                    valor=produto.getPreco();
                }
            }
        }
        return maisCaro;
    }

    public Produto produtoMaisBarato(){
        Produto maisBarato=null;
        double valor= Double.MAX_VALUE;
        if(estoque.isEmpty()==false){
            for(Produto produto : estoque.values()){
                if(produto.getPreco()<valor){
                    maisBarato=produto;
                    valor=produto.getPreco();
                }
            }
        }
        return maisBarato;
    }

    public Produto maiorQuantidade(){
        Produto maiorQuantidade= null;
        int quantidade=Integer.MIN_VALUE;
        if(estoque.isEmpty()==false){
            for(Produto produto : estoque.values()){
                if(produto.getQuantidade()> quantidade){
                    quantidade=produto.getQuantidade();
                    maiorQuantidade=produto;
                }
            }
        }
        return maiorQuantidade;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoque.isEmpty()) {
          for (Map.Entry<Long, Produto> entry : estoque.entrySet()) {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }

    public static void main(String[] args){

        EstoqueDeProdutos estoque= new EstoqueDeProdutos();

        estoque.adicionarProduto((long)12345678, "toalhinha", 8, 0.50);
        estoque.adicionarProduto((long)12345679, "sandalia", 8, 12);
        estoque.adicionarProduto((long)12345680, "camisa", 12, 20);
        estoque.adicionarProduto((long)12345681, "camisa cor", 10, 25);
        estoque.adicionarProduto((long)12345682, "mouse-pad ", 4, 0.5);

        System.out.println(estoque.maiorQuantidade());
        System.out.println(estoque.produtoMaisBarato());
        System.out.println(estoque.produtoMaisCaro());
        System.out.println(estoque.valorEmEstoque());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
