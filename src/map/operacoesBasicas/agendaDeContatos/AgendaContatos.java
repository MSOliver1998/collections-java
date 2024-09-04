package map.operacoesBasicas.agendaDeContatos;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {

    private Map<String,Integer> agendaDeContatos;

    public  AgendaContatos(){
        this.agendaDeContatos= new HashMap<>();
    }
    
    public void adicionarContato(String nome, Integer telefone){
        agendaDeContatos.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(this.agendaDeContatos.isEmpty()){
            agendaDeContatos.remove(nome);
        } else {
          System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos(){
        System.out.println(this.agendaDeContatos);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numero=null;
        if(agendaDeContatos.isEmpty()==false){
            numero= agendaDeContatos.get(nome);
        }else {
            System.out.println("A agenda de contatos está vazia.");
          }
        return numero;
    }

    public static void main(String[] args){

        AgendaContatos agenda=new AgendaContatos();

        agenda.adicionarContato("lucas",2134567889);
        agenda.adicionarContato("pedro", 2045678913);
        agenda.adicionarContato("lucas1", 2056789010);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisaPorNome("pedro"));

    }

}
