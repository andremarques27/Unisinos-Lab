package semanas5_6;

public class Computador {

    private String marca;
    private double velocidade;
    private int anoFab;
    private boolean novo;

    public Computador(String marca, double velocidade, int anoFab, boolean novo) {
        this.marca = marca;
        this.velocidade = velocidade;
        this.anoFab = anoFab;
        this.novo = novo;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public boolean isNovo() {
        return novo;
    }
}
