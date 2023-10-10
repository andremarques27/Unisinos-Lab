package semanas9_10;

public class Banana extends Fruta{

    private String tipo;
    public Banana(String nome, double preco) {
        super(nome, preco);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
