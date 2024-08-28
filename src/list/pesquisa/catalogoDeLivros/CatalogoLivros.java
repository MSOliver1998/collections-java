package list.pesquisa.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livros= new ArrayList<>();
    
    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livros.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAuthor(String autor){
        List<Livro> livrosRetornados= new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro livro : livros) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosRetornados.add(livro);
                };
            }
        }
        return livrosRetornados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosRetornados=new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro livro : livros) {
                if(livro.getAnoDePublicacao()>=anoInicial && livro.getAnoDePublicacao()<=anoFinal ){
                    livrosRetornados.add(livro);
                }
            }
        }
        return livrosRetornados;
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livrosRetornados= new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro livro : livros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livrosRetornados.add(livro);
                };
            }
        }
        return livrosRetornados;
    }

    public static void main(String[] args){
        CatalogoLivros catalogo= new CatalogoLivros();
        catalogo.adicionarLivro("clean code", "Robert.jr", 2008);
        catalogo.adicionarLivro("trash code", "Felipe", 2010);
        catalogo.adicionarLivro("Harry Potter", "JJK holling", 2006);
        catalogo.adicionarLivro("Harry potter 2", "jjk holing", 2004);
        catalogo.adicionarLivro("solid", "kelvin", 2014);
        catalogo.adicionarLivro("stade", "Robert.jr", 2008);
    
        System.out.println(catalogo.pesquisarPorAuthor("robert.jr"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2009, 2014));
        System.out.println(catalogo.pesquisarPorTitulo("clean code"));
    }

}
