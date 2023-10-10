package semanas9_10;

public class Aluno extends Pessoa{

    private double nota;

    public Aluno(String nome, int idade, double nota){
        super(nome,idade);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void imprimeDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Nota: " + getNota());
    }
}
