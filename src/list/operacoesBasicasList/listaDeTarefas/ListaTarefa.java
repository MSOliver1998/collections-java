package list.operacoesBasicasList.listaDeTarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa{
    private List<Tarefa> tarefaList;

    public static void main(String[] args) {
        ListaTarefa listaDeTarefa=new ListaTarefa();
        listaDeTarefa.adicinarTarefa("limpar o quarto");
        listaDeTarefa.adicinarTarefa("limpar o quarto");
        listaDeTarefa.adicinarTarefa("limpar o banheiro");
        listaDeTarefa.adicinarTarefa("limpar a sala");
        listaDeTarefa.adicinarTarefa("limpar o banheiro");
        System.out.println(listaDeTarefa.obterNumeroTotalDeTarefas());

        listaDeTarefa.removerTarefa("limpar o quarto");
        System.out.println(listaDeTarefa.obterNumeroTotalDeTarefas());

        listaDeTarefa.obterDescricaoDeTarefas();
    }

    public ListaTarefa(){
        this.tarefaList=new ArrayList<>();
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void adicinarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover=new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoDeTarefas(){
        System.out.println(tarefaList);
    }
}