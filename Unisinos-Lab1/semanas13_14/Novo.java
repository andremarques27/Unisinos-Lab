package semanas13_14;

public class Novo extends Livro{

    private double desconto;

    public Novo(String titulo, String autor, double preco, int anoPublicacao, double desconto) {
        super(titulo, autor, preco, anoPublicacao);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString(){
        return "Titulo: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Ano publicação: " + getAnoPublicacao() + "\n" +
                "Valor: " + getPreco() + "\n" +
                "Desconto: " + this.desconto;
    }
}
