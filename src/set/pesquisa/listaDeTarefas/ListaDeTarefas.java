package set.pesquisa.listaDeTarefas;

import java.util.Set;
import java.util.HashSet;

public class ListaDeTarefas {

    Set<Tarefa> tarefas;

    public ListaDeTarefas(){
        tarefas= new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefa=null;
        for(Tarefa tar: tarefas){
            if(tar.getDescricao().equals(descricao)){
                tarefa=tar;
            }
        }
        tarefas.remove(tarefa);
    }

    public void exibirTarefas(){
        System.out.println(tarefas);
    }

    public void contarTarefas(){
        System.out.println(tarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){

        Set<Tarefa> concluidas= new HashSet<>();

        for(Tarefa tar : tarefas){
            if(tar.getConcluida()==true){
                concluidas.add(tar);
            }
        }

        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){

        Set<Tarefa> pendentes= new HashSet<>();

        for(Tarefa tar: tarefas){
            if(tar.getConcluida()==false){
                pendentes.add(tar);
            }
        }

        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tar: tarefas){
            if(tar.getDescricao()==descricao){
                tar.setConcluida(true);
            };
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa tar: tarefas){
            if(tar.getDescricao()==descricao){
                tar.setConcluida(false);
            };
        }
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }

    public static void main(String[] args){

        ListaDeTarefas toDo= new ListaDeTarefas();

        toDo.adicionarTarefa("limpar o quarto");
        toDo.adicionarTarefa("programar");
        toDo.adicionarTarefa("estudar");
        toDo.adicionarTarefa("trabalhar");
        toDo.marcarTarefaConcluida("limpar o quarto");
        toDo.contarTarefas();
        System.out.println(toDo.obterTarefasConcluidas());
        System.out.println(toDo.obterTarefasPendentes());

        toDo.exibirTarefas();
        toDo.limparListaTarefas();
        toDo.exibirTarefas();

    }

}
