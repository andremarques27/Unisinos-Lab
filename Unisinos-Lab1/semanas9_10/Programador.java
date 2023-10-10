package semanas9_10;

public class Programador extends Pessoa{

    private String linguagemProg;

    public Programador(String nome, int idade, String linguagemProg){
        super(nome, idade);
        this.linguagemProg = linguagemProg;
    }

    public String getLinguagemProg() {
        return linguagemProg;
    }

    public void setLinguagemProg(String linguagemProg) {
        this.linguagemProg = linguagemProg;
    }

    public void imprimeDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Linguagem preferida: " + getLinguagemProg());
    }
}
