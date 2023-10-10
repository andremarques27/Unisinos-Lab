package semanas5_6;

public class Livro {

    private String titulo;
    private String autor;
    private int anoLancamento;
    private double preco;
    private int numPag;

    public Livro(String titulo, String autor, int anoLancamento, double preco, int numPag){

        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
        this.numPag = numPag;

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

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public double calcularPrecoPorPagina() {
        return preco / numPag;
    }

    public void imprimeLivro() {

        System.out.println("O nome do livro é " + titulo);
        System.out.println("O autor do livro é " + autor);
        System.out.println("O livro tem " + numPag + " paginas");
        System.out.println("O ano de lancamento do livro é " + titulo);
        System.out.println("O preco do livro é " + preco);
    }
}
