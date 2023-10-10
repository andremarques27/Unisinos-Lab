package semanas7_8;

public class FuncionarioCaixa {

    private String nome;
    private String endereco;
    private String sexo;
    private Calculadora calculadora;

    public FuncionarioCaixa(){
        this.nome = "Andre";
        this.endereco = "Jaguarão, 106";
        this.sexo = "Masculino";
    }

    public FuncionarioCaixa(String nome, String endereco, String sexo){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = new Calculadora("Azul");
    }

    public double soma(double num1, double num2){
        return calculadora.soma(num1, num2);
    }

    public double subtrai(double num1, double num2){
        return calculadora.subtrai(num1,num2);
    }

    public double multiplica(double num1, double num2){
        return calculadora.multiplica(num1, num2);
    }

    public double divide(double num1, double num2){
        return calculadora.divide(num1, num2);
    }

    public double elevaAoQuadrado(double num){
        return calculadora.elevaAoQuadrado(Math.pow(num, 2));
    }

    public double elevaAoCubo(double num){
        return calculadora.elevaAoCubo(Math.pow(num, 3));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Sexo: " + getSexo();
    }
}
