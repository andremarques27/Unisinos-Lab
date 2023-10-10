package semanas5_6;

import semanas5_6.Aluno;

import java.util.Scanner;

public class PrincipalAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Brandamente Brasil", 1585258, 5, 9);
        Aluno aluno2 = new Aluno("Radigunda Cercená", 2254879, 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", 1085994, 7, 1);

        aluno1.imprimeInfo();
        System.out.println("==========================");
        aluno2.imprimeInfo();
        System.out.println("==========================");
        aluno3.imprimeInfo();

        System.out.println("==========================");

        aluno2.setGrauA(9);
        System.out.println("Nota de Radugunda com media 9: " + aluno2.calculaMediaFinal());

        System.out.println("==========================");

        System.out.println("Matricula de Vitimado: " + aluno3.getMatricula());

        System.out.println("==========================");

        aluno1.setMatricula(1585258);
        System.out.println("Nova matricula de Brandamante: " + aluno1.getMatricula());

        System.out.println("==========================");

        System.out.println("Digite a nota de grau B de Radigunda Cercená: ");
        double grauB = scan.nextDouble();
        System.out.println("Nova media de Radigunda: " + grauB);
    }

}
