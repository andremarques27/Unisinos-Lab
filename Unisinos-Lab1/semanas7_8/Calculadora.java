package semanas7_8;

public class Calculadora {

    private int memoria;
    private String cor;

    public Calculadora(String cor){
        this.memoria = 0;
        this.cor = cor;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public double subtrai(double num1, double num2){
        return num1 - num2;
    }

    public double multiplica(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2){
        return num1 / num2;
    }

    public double elevaAoQuadrado(double num){
        return Math.pow(num, 2);
    }

    public double elevaAoCubo(double num){
        return Math.pow(num, 3);
    }

}
