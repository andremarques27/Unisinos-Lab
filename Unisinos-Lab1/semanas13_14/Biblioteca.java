package semanas13_14;

public class Biblioteca {

    private Livro[] livros;

    public Biblioteca(int qtdLivros){
        this.livros = new Livro[qtdLivros];

    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public boolean insereLivro(Livro livro){
        for (int i = 0; i < livros.length; i++){
            if (livros[i] == null){
                livros[i] = livro;
                return true;
            }
        }
        return false;
    }

    public String procuraLivroPorTitulo(String titulo){
        for (int i = 0; i < livros.length; i++){
            if (livros[i].getTitulo().equals(titulo)){
                return livros[i].toString();
            }
        }
        return null;
    }

    public double verificaDesconto(String titulo){
        for (int i = 0; i < livros.length; i++){
            if (livros[i] instanceof Novo && livros[i].getTitulo().equals(titulo)){
                return ((Novo)livros[i]).getDesconto();
            }
        }
        return -1;
    }

    public void imprimeEdicoes(){
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] instanceof Antigo) {
                System.out.println(livros[i].toString());
            }
        }
    }

    public void imprimeLivroPorAno(){

        for (int i = 0; i < livros.length; i++) {

        }
    }

    public double calculaMediaPreco(){
        double total = 0;
        double media;
        for (int i = 0; i < livros.length; i++){
            total += livros[i].getPreco();
        }
        media = total / livros.length;
        return media;
    }

    public Livro livroComMaiorTitulo(){
        int tamanhoString = 0;
        Livro livro = null;
        for (int i = 0; i < livros.length; i++){
            if (livros[i].getTitulo().length() > tamanhoString) {
                tamanhoString = livros[i].getTitulo().length();
                livro = livros[i];
            }
        }
        return livro;
    }

}
