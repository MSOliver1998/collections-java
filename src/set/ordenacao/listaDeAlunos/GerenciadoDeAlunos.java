package set.ordenacao.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadoDeAlunos {
    
    private Set<Aluno> alunosList;

    public GerenciadoDeAlunos(){
        this.alunosList= new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosList.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover=null;
        for(Aluno aluno: alunosList ){
            if(aluno.getMatricula()==matricula){
                alunoParaRemover=aluno;
                break;
            }
        }
        alunosList.remove(alunoParaRemover);
    }

    public void exibirAlunoPorNome(){
        Set<Aluno> alunosPorNome= new TreeSet<Aluno>(alunosList);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunos(){
        Set<Aluno> alunos=new HashSet<>(alunosList);
        System.out.println(alunos);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota =new TreeSet<>(new CompareToMatricula());
        alunosPorNota.addAll(alunosList);
        System.out.println(alunosPorNota);

    }

    public static void main(String[] args){
        
        GerenciadoDeAlunos alunosMatriculados= new GerenciadoDeAlunos();

        alunosMatriculados.adicionarAluno("Hulda", (long) 123456789, 6);
        alunosMatriculados.adicionarAluno("Hulda", (long) 123456785, 9);
        alunosMatriculados.adicionarAluno("Sally", (long) 843904308, 10);
        alunosMatriculados.adicionarAluno("Dale", (long) 873904308, 10);

        alunosMatriculados.exibirAlunoPorNome();
        alunosMatriculados.exibirAlunosPorNota();
        alunosMatriculados.exibirAlunos();

    }

}
