package list.operacoesBasicasList.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> carrinho= new ArrayList<>();

    public static void main(String[] args){
        CarrinhoDeCompras cart= new CarrinhoDeCompras();

        cart.adicionarItem("copo", 12.50, 2);
        cart.adicionarItem("prato", 16.3, 2);
        cart.adicionarItem("talher", 20.00, 5);
        cart.adicionarItem("pano de prato", 2.50, 2);

        cart.exibirItens();
        cart.calcularValorTotal();

        cart.removerItem("talher");

        cart.exibirItens();

    }

    public void removerItem(String nome){
        List<Item> itensParaRemover=new ArrayList<>();
        for (Item item : carrinho) {
            if(item.getName().equals(nome)){
                itensParaRemover.add(item);
            }
        }

        carrinho.removeAll(itensParaRemover);
    }

    public void adicionarItem(String nome, Double preco, int quantidade){
        Item item= new Item(nome, quantidade, preco);
        carrinho.add(item);
    }

    public void calcularValorTotal(){
        float total=0;
        for (Item item : carrinho) {
            total+=item.getPrice() * item.getQuantidade();
        }
        System.out.println(total);
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }
}
