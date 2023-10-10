package semanas7_8;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nome = scan.next();
        System.out.println("Digite o endereço do funcionário: ");
        String endereco = scan.next();
        System.out.println("Digite o sexo do funcionário: ");
        String sexo = scan.next();

        FuncionarioCaixa funcionarioCaixa = new FuncionarioCaixa(nome,endereco,sexo);

        double soma = funcionarioCaixa.soma(2, 2);
        double subtrai = funcionarioCaixa.subtrai(5, 4);
        double multiplica = funcionarioCaixa.multiplica(2, 3);
        double divide = funcionarioCaixa.divide(6, 3);
        double elevaAoQuadrado = funcionarioCaixa.elevaAoQuadrado(72);
        double elevaAoCubo = funcionarioCaixa.elevaAoCubo(83);

        System.out.println(soma);
        System.out.println(subtrai);
        System.out.println(multiplica);
        System.out.println(divide);
        System.out.println(elevaAoQuadrado);
        System.out.println(elevaAoCubo);

        System.out.println("Digite o nome da empresa: ");
        String nomeEmpresa = scan.next();

        Empresa empresa1 = new Empresa(nomeEmpresa);

        funcionarioCaixa.toString();



    }
}
