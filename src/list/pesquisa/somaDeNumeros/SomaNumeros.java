package list.pesquisa.somaDeNumeros;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros{

    private List<Integer> listaDeNumeros= new ArrayList<>();

    public void adicionarNumero(int numero){
        listaDeNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma=0;
        for (Integer num : listaDeNumeros) {
            soma+=num;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior=Integer.MIN_VALUE;
        for (Integer num : listaDeNumeros) {
            if(num>maior){
                maior=num;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor=Integer.MAX_VALUE;
        int index=0;
        for (Integer num : listaDeNumeros) {
            if(num<menor || index==0){
                menor=num;
            }
            index ++;
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return listaDeNumeros;
    }

    public static void main(String[] args){
        SomaNumeros listaDeNumeros= new SomaNumeros();

        listaDeNumeros.adicionarNumero(3);
        listaDeNumeros.adicionarNumero(5);
        listaDeNumeros.adicionarNumero(2);
        listaDeNumeros.adicionarNumero(-9);
        listaDeNumeros.adicionarNumero(7);
        listaDeNumeros.adicionarNumero(10);
        listaDeNumeros.adicionarNumero(6);

        System.out.println(listaDeNumeros.calcularSoma());
        System.out.println(listaDeNumeros.encontrarMaiorNumero());
        System.out.println(listaDeNumeros.encontrarMenorNumero());
        System.out.println(listaDeNumeros.exibirNumeros());
    }

}

