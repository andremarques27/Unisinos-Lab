package semanas13_14;

public class Churro {

    private String sabor;
    private double preco;

    public Churro(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
    }

    public Churro(String sabor){
        this.sabor = sabor;
    }

    public Churro(){

    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Churro sabor: " + this.sabor + "\n" +
                "Preço: " + this.preco;
    }
}
