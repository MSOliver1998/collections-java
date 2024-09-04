package set.ordenacao.listaDeAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double nota;

    public Aluno(String nome, long matricula, double nota){
        this.nome=nome;
        this.matricula=matricula;
        this.nota=nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public long getMatricula() {
        return matricula;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public Double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Aluno o) {
       return nome.compareToIgnoreCase(o.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Aluno aluno)){
            return false;
        }
        return getMatricula()==aluno.getMatricula();
    }

    @Override
    public String toString() {
        return "Aluno:{ nome: " + nome + ", matricula: " + matricula+ ", nota:" + nota +" }";
    }
}

class CompareToMatricula implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
    
}