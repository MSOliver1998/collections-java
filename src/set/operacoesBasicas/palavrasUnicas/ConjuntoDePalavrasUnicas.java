package set.operacoesBasicas.palavrasUnicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoDePalavrasUnicas {
    
    private Set<String> palavras;

    public ConjuntoDePalavrasUnicas(){
        this.palavras= new HashSet<>();
    }

    public void  adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }

    public static void main(String[] args){
        ConjuntoDePalavrasUnicas palavras = new ConjuntoDePalavrasUnicas();

        palavras.adicionarPalavra("oi");
        palavras.adicionarPalavra("thau");
        palavras.removerPalavra("oi");
        palavras.adicionarPalavra("oi");
        palavras.removerPalavra("thau");

        System.out.println(palavras.verificarPalavra("thau"));

        palavras.exibirPalavrasUnicas();
    }
}
