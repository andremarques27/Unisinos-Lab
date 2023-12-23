package semanas13_14;

public class BancaDeChurro {

    private Churro[] churros;

    Churro churro = new Churro("Doce de Leite", 4.15);
    Churro churro2 = new Churro("Chocolate", 4.50);
    Churro churro3 = new Churro("Goiabada", 4.75);
    public BancaDeChurro(Churro[] churros){
        this.churros = new Churro[3];
        churros[0] = churro;
        churros[1] = churro2;
        churros[2] = churro3;
    }

    public BancaDeChurro(Churro[] churros, int qtdMaxChurros){
        this.churros = new Churro[qtdMaxChurros];
    }


    public Churro[] getChurros() {
        return churros;
    }

    public void setChurros(Churro[] churros) {
        this.churros = churros;
    }

    public String EstoqueChurros(String sabor){
        int qtdChurros = 0;
        for (int i = 0; i < churros.length; i++){
            if (churros[i].getSabor().equals(sabor)){
                qtdChurros++;
            }
        }
        return "Tem " + qtdChurros + " do sabor " + sabor;
    }

    public boolean insereChurro(Churro churro){
        for (int i = 0; i < churros.length; i++){
            if (churros[i] == null){
                churros[i] = churro;
                return true;
            }
        }
        return false;
    }

    public String valorTotal(){
        double valorTotal = 0;
        for (int i = 0; i < churros.length; i++){
            valorTotal += churros[i].getPreco();
        }
        return "O valor total dos churros é " + valorTotal;
    }

    public boolean vendeChurros(String sabor){
        for (int i = 0; i < churros.length; i++){
            if (churros[i].getSabor().equals(sabor)){
                System.out.println("Churro sabor " + sabor + " vendido. \n" +
                        "no valor de " + churros[i].getPreco());
                churros[i] = null;
                return true;
            }
        }
        System.out.println("Sabor solicitado não existe.");
        return false;
    }

    public void imprimeChurros(){
        for (int i = 0; i < churros.length; i++){
            System.out.println(churros[i]);
            System.out.println();
        }
    }

    public String lePedidos(String nome, String sabor, int quantidade){
        do {
            vendeChurros(sabor);
            quantidade--;
        }while (quantidade != 0);

        return quantidade + " foram vendidos para o cliente " + nome;
    }
}
