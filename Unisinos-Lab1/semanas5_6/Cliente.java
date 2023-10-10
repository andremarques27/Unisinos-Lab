package semanas5_6;

public class Cliente {

    private String nome;
    private int idade;
    private String sexo;
    private String email;
    private String senha;

    public Cliente(String nome, int idade, String sexo, String email, String senha){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void imprimeCliente() {

        System.out.println("O nome do cliente é " + nome);
        System.out.println("A idade do cliente é " + idade);
        System.out.println("O sexo do cliente é " + sexo);
        System.out.println("O email do cliente é " + email);
        System.out.println("A senha do cliente é  " + senha);
    }
}
