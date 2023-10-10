package semanas9_10;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*Banana banana = new Banana("Caturra",5.99);
        Melancia melancia = new Melancia("Amarela", 17.99, 0, false);
        Programador programador = new Programador("Andre", 24, "Java");
        Aluno aluno = new Aluno("Pablo", 21, 650);*/


        System.out.println("Quer criar um programador(p) ou um aluno(a)");
        String leitor = scan.nextLine();

        Pessoa p;
        if (leitor.equalsIgnoreCase("p")){
            System.out.println("Digite o nome do programador: ");
            String nome = scan.nextLine();
            System.out.println("Digite a idade do programador: ");
            int idade = scan.nextInt();
            System.out.println("Digite a linguagem de programação favorita: ");
            String linguagem = scan.next();
            p = new Programador(nome,idade,linguagem);
            p.imprimeDados();
        } else if (leitor.equalsIgnoreCase("a")) {
            System.out.println("Digite o nome do aluno: ");
            String nome = scan.nextLine();
            System.out.println("Digite a idade do aluno: ");
            int idade = scan.nextInt();
            System.out.println("Digite a nota do aluno: ");
            double nota = scan.nextDouble();
            p = new Aluno(nome, idade, nota);
            p.imprimeDados();
        }
    }
}
