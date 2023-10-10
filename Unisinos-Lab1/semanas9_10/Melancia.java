package semanas9_10;

import java.util.Date;

public class Melancia extends Fruta{

    private double precoExtra;
    private boolean epoca;
    public Melancia(String nome, double preco, double precoExtra, boolean epoca) {
        super(nome, preco);
        this.precoExtra = precoExtra;
        this.epoca = epoca;
    }

    public double getPrecoExtra() {
        return precoExtra;
    }

    public void setPrecoExtra(double precoExtra) {
        this.precoExtra = precoExtra;
    }

    public boolean isEpoca() {
        return epoca;
    }

    public void setEpoca(boolean epoca) {
        this.epoca = epoca;
    }

    public double calculaPrecoFinal(){
        if (epoca == true){
            return getPreco();
        }else return getPreco() + getPrecoExtra();
    }
}
