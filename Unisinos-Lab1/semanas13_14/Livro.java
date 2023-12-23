package semanas13_14;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;
    private int anoPublicacao;

    public Livro(String titulo, String autor, double preco, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Ano publicação: " + this.anoPublicacao + "\n" +
                "Valor: " + this.preco;

    }
}
