package list.pesquisa.catalogoDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo=titulo;
        this.autor=autor;
        this.anoDePublicacao=anoDePublicacao;
    }

    public int getAnoDePublicacao() {
        return this.anoDePublicacao;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String toString() {
        return titulo + " " + autor + " "+ anoDePublicacao;
    }
}
