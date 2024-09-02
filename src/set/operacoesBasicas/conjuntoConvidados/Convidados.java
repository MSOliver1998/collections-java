package set.operacoesBasicas.conjuntoConvidados;

import java.util.Objects;

public class Convidados {
    
    private String nome;
    private int codigoDoConvite;

    public Convidados(String nome, int codigoDoConvite){
        this.nome=nome;
        this.codigoDoConvite=codigoDoConvite;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCodigoDoConvite(){
        return this.codigoDoConvite;
    }

    @Override
    public boolean equals(Object obj) {
        if(this== obj){
            return true;
        }
        if(!(obj instanceof Convidados convidado)){
            return false;
        }

        return getCodigoDoConvite() == convidado.getCodigoDoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoDoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{ nome= " + nome + ", codigoDoConvite= "+ codigoDoConvite + "}";
    }
}
