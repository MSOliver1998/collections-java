package map.operacoesBasicas.dicionario;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    
    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario= new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(this.dicionario.isEmpty()==false){
            dicionario.remove(palavra);
        }
    }

    public void exibirPalavras(){
        if(this.dicionario.isEmpty()==false){
            System.out.println(this.dicionario);
        }
    }

    public String pesquisarPalavra(String palavra){
        String palavraProcurada=null;
        if(dicionario.isEmpty()==false){
            if(dicionario.containsKey(palavra)){
                palavraProcurada=dicionario.get(palavra);
            }
        }
        return palavraProcurada;
    }

    public static void main(String[] args){

        Dicionario dicionario= new Dicionario();

        dicionario.adicionarPalavra("paciência", "Capacidade de tolerar contrariedades, dissabores, infelicidades ou incómodos com calma ou resignação.");
        dicionario.adicionarPalavra("jogo", "atividade cuja natureza ou finalidade é a diversão, o entretenimento");
        dicionario.adicionarPalavra("programação", "Acto ou efeito de programar; plano; programa; conjunto de programas ou planos. 2. [ Informática ] Criação de um programa para computador.");

        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPalavra("jogo"));

    }
}
