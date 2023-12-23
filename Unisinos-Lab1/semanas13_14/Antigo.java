package semanas13_14;

public class Antigo extends Livro{

    private int edicao;

    public Antigo(String titulo, String autor, double preco, int anoPublicacao, int edicao) {
        super(titulo, autor, preco, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString(){
        return "Titulo: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Ano publicação: " + getAnoPublicacao() + "\n" +
                "Valor: " + getPreco() + "\n" +
                "Edição: " + this.edicao;
    }
}
