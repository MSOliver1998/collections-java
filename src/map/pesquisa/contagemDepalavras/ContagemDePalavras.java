package map.pesquisa.contagemDepalavras;

import java.util.Map;
import java.util.HashMap;

public class ContagemDePalavras {
    
    Map<String,Integer> palavras;

    public ContagemDePalavras(){
        this.palavras= new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        }else{
            System.out.println("vazio");
        }
    }

    public Map<String,Integer> exibirContagemPalavras(){
        return palavras;
    }

    public String maisFrequente(){
        int quantidade=Integer.MIN_VALUE;
        String frequente = null;

        for(Map.Entry<String,Integer> entry : palavras.entrySet()){
            if(entry.getValue()>quantidade){
                quantidade=entry.getValue();
                frequente= entry.getKey();
            }
        };
        return frequente;
    }

    public static void main(String[] args){
        ContagemDePalavras contagemLinguagens= new ContagemDePalavras();

        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
        contagemLinguagens.removerPalavra("Python");

        System.out.println(contagemLinguagens.exibirContagemPalavras());
        System.out.println(contagemLinguagens.maisFrequente());
    }

}
