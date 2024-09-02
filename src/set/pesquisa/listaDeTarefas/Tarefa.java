package set.pesquisa.listaDeTarefas;

public class Tarefa {

    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao, boolean concluida){
        this.descricao=descricao;
        this.concluida=concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean getConcluida(){
        return this.concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{descricao: " + descricao + ", concluida: " + concluida + "}";
    }

}
