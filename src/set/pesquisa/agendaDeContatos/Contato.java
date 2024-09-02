package set.pesquisa.agendaDeContatos;

public class Contato {
    
    private String nome;
    private int numeroDeTelefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDeTelefone(int numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public Contato(String nome, int numeroDeTelefone){
        this.nome=nome;
        this.numeroDeTelefone=numeroDeTelefone;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroDeTelefone() {
        return this.numeroDeTelefone;
    }

    @Override
    public String toString() {
        return "Contato{nome: "+ nome + ", telefone: " + numeroDeTelefone + "}";
    }
}
