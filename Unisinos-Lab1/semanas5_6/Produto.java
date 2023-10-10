package semanas5_6;

public class Produto {

    private String nome;
    private double valor;
    private String descicao;
    private int estoque;

    public Produto(String nome, double valor, String descicao, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.descicao = descicao;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getDescicao() {
        return descicao;
    }

    public int getEstoque() {
        return estoque;
    }
}
