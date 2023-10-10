package semanas7_8;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int qtdPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, double preco, int qtdPaginas){

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.qtdPaginas = qtdPaginas;

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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public double calcularPrecoPorPagina() {
        return preco / qtdPaginas;
    }

    @Override
    public String toString() {
        return String.format(
                "Livro [Título = %s, Autor = %s, Publicação = %d, Preco = R$%.2f, Páginas = %d, Preço por Página = R$%.2f]",
                this.titulo, this.autor, this.anoPublicacao, this.preco, this.qtdPaginas, this.calcularPrecoPorPagina());
    }
}