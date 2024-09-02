package set.operacoesBasicas.conjuntoConvidados;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

    private Set<Convidados> convidados;

    public ConjuntoConvidados(){
        this.convidados=new HashSet<>();
    }

    void adicionarConvidados(String nome, int codigoDoConvite){
        Convidados convidado= new Convidados(nome,codigoDoConvite);
        convidados.add(convidado);
    }

    public void removerConvidados(int codigoConvidado){
        Convidados convidadosParaRemover=null;

        for(Convidados convidado : convidados){
            if(convidado.getCodigoDoConvite() == codigoConvidado){
                convidadosParaRemover=convidado;
                break;
            }
        }

        convidados.remove(convidadosParaRemover);
    }

    public void contarConvidados(){
        System.out.println(convidados.size());
    }

    void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args){

        ConjuntoConvidados convidados= new ConjuntoConvidados();

        convidados.adicionarConvidados("matheus", 123);
        convidados.adicionarConvidados("lucas", 124);
        convidados.adicionarConvidados("Fernanda", 125);
        convidados.adicionarConvidados("lucio", 126);
        convidados.adicionarConvidados("lucio", 125);

        convidados.exibirConvidados();

        convidados.removerConvidados(123);

        convidados.exibirConvidados();

        convidados.contarConvidados();

    }

}
