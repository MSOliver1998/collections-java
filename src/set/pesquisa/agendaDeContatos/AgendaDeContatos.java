package set.pesquisa.agendaDeContatos;

import java.util.Set;
import java.util.HashSet;

public class AgendaDeContatos {

    private Set<Contato> contatos;
    
    public AgendaDeContatos(){
        this.contatos=new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero ));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public void pesquisaPorNome(String nome){
        Set<Contato> listarContatos=new HashSet<>();

        for(Contato contato: contatos){
            if(contato.getNome().equals(nome)){
                listarContatos.add(contato);
            }
        }

        System.out.println(listarContatos);
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if (!contatos.isEmpty()) {
          for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
              c.setNumeroDeTelefone(novoNumero);
              contatoAtualizado = c;
              break;
            }
          }
          return contatoAtualizado;
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        
        AgendaDeContatos agenda=new AgendaDeContatos();

        agenda.adicionarContato("lucio", 000000000);
        agenda.adicionarContato("lucas", 999999999);
        agenda.adicionarContato("fernanda", 111111111);
        agenda.pesquisaPorNome("lucas");
        System.out.println(agenda.atualizarNumeroContato("lucas", 333333333));
        agenda.exibirContatos();
    }

}
