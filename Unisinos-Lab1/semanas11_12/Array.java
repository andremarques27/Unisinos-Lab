package semanas11_12;

import java.util.Objects;

public class Array {

    public int procuraNome(String[] nomes, String nome){
        for (int i = 0; i < nomes.length; i++){
            if (Objects.equals(nomes[i], nome)){
                return i;
            }
        }
        return -1;
    }

    public double calculaMedia(double[] valores) {
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma / valores.length;
    }

    public void imprimeAvaliacoesMotoristas(MotoristaApp[] motoristas, String nome){
        System.out.println("Avaliaçoes do motorista " + nome + ":");
        for (int i = 0; i < motoristas.length; i++){
            if (motoristas[i] != null){
                if (motoristas[i].getNome().equals(nome)){
                    motoristas[i].imprimeAvalioacvoes();
                }
            }
        }
    }

    public static void main(String[] args) {

        MotoristaApp[] motoristas = new MotoristaApp[10];
        for (int i = 0; i < motoristas.length; i++){
            motoristas[i] = new MotoristaApp("Fulano " + i, 100);
        }

        if (motoristas[5].insereAvaliacao(4.7)){
            System.out.println("Avaliaçao inserida com sucesso!");
        }else {
            System.out.println("Erro ao inserir uma avaliação! :(");
        }

        Array e = new Array();
        e.imprimeAvaliacoesMotoristas(motoristas, Teclado.leString("Digite o nome do motorista"));

        double[] d = new double[132];

        d[3] = 19;
        d[75] = 32;

        System.out.println("Tamanho do array: " + d.length);

        for (int i = 0; i < d.length; i++){
            d[i] = i;
        }

        for (int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }

    }
}
