package semanas5_6;

public class Aluno {

    private String nome;
    private int matricula;
    private double grauA;
    private double grauB;

    public Aluno(String nome, int matricula, double grauA, double grauB){

        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getGrauA() {
        return grauA;
    }

    public void setGrauA(double grauA) {
        this.grauA = grauA;
    }

    public double getGrauB() {
        return grauB;
    }

    public void setGrauB(double grauB) {
        this.grauB = grauB;
    }

    public double calculaMediaFinal() {
        return (grauA * 0.33) + (grauB * 0.67);
    }

    public void imprimeInfo() {

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota grau A: " + grauA);
        System.out.println("Nota grau B: " + grauB);
        System.out.println("A media fina é: " + calculaMediaFinal());
    }
}
