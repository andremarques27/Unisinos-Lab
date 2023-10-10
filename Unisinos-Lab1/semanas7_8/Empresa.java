package semanas7_8;

public class Empresa {

    private String nome;
    private FuncionarioCaixa funcionarioCaixa;
    private FuncionarioCaixa funcionarioCaixa2;

    public Empresa(String nome, String nomeFuncionario1, String nomeFuncionario2){
        this.nome = nome;
        this.funcionarioCaixa = new FuncionarioCaixa();
        this.funcionarioCaixa2 = new FuncionarioCaixa();
        funcionarioCaixa.setNome(nomeFuncionario1);
        funcionarioCaixa2.setNome(nomeFuncionario2);
    }

    public Empresa(String nome){
        this.nome = nome;
        funcionarioCaixa = null;
        funcionarioCaixa2 = null;
    }

    public Empresa(){
        this.nome = "Lisboa";
        funcionarioCaixa = null;
        funcionarioCaixa2 = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioCaixa getFuncionarioCaixa() {
        return funcionarioCaixa;
    }

    public void setFuncionarioCaixa(FuncionarioCaixa funcionarioCaixa) {
        this.funcionarioCaixa = funcionarioCaixa;
    }
}
