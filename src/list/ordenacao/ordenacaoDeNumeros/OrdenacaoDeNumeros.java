package list.ordenacao.ordenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeNumeros{
    public static void main(String[] args){
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoDeNumeros numeros = new OrdenacaoDeNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }

    private List<Integer> listNumeros=new ArrayList<>();
    
    public OrdenacaoDeNumeros(){
        this.listNumeros=new ArrayList<>();
    }

    public List<Integer> getNumeros(){
        return listNumeros;
    }

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public void exibirNumeros(){
        System.out.println(this.listNumeros);
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendetes = new ArrayList<>(this.listNumeros);
        numerosDescendetes.sort(Collections.reverseOrder());
        return numerosDescendetes;
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes= new ArrayList<>(this.listNumeros);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

}