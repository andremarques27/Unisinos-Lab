package semanas5_6;

import semanas5_6.Cliente;
import semanas5_6.Livro;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idCliente = 1;
        System.out.println("Digite o nome do cliente " + idCliente + ": ");
        String nomeCliente1 = scan.next();
        System.out.println("Digite a idade do cliente " + idCliente + ": ");
        int idadeCliente1 = scan.nextInt();
        System.out.println("Digite o sexo do cliente " + idCliente + ": ");
        String sexoCliente1 = scan.next();
        System.out.println("Digite o email do cliente " + idCliente + ": ");
        String emailCliente1 = scan.next();
        System.out.println("Digite a senha do cliente " + idCliente + ": ");
        String senhaCliente1 = scan.next();

        Cliente cliente1 = new Cliente(nomeCliente1, idadeCliente1, sexoCliente1, emailCliente1, senhaCliente1);

        idCliente++;
        System.out.println("Digite o nome do cliente " + idCliente + ": ");
        String nomeCliente2 = scan.next();
        System.out.println("Digite a idade do cliente " + idCliente + ": ");
        int idadeCliente2 = scan.nextInt();
        System.out.println("Digite o sexo do cliente " + idCliente + ": ");
        String sexoCliente2 = scan.next();
        System.out.println("Digite o email do cliente " + idCliente + ": ");
        String emailCliente2 = scan.next();
        System.out.println("Digite a senha do cliente " + idCliente + ": ");
        String senhaCliente2 = scan.next();

        Cliente cliente2 = new Cliente(nomeCliente2, idadeCliente2, sexoCliente2, emailCliente2, senhaCliente2);

        idCliente++;
        System.out.println("Digite o nome do cliente " + idCliente + ": ");
        String nomeCliente3 = scan.next();
        System.out.println("Digite a idade do cliente " + idCliente + ": ");
        int idadeCliente3 = scan.nextInt();
        System.out.println("Digite o sexo do cliente " + idCliente + ": ");
        String sexoCliente3 = scan.next();
        System.out.println("Digite o email do cliente " + idCliente + ": ");
        String emailCliente3 = scan.next();
        System.out.println("Digite a senha do cliente " + idCliente + ": ");
        String senhaCliente3 = scan.next();

        Cliente cliente3 = new Cliente(nomeCliente3, idadeCliente3, sexoCliente3, emailCliente3, senhaCliente3);

        int idLivro = 1;
        System.out.println("Digite o titulo do livro " + idLivro + ": ");
        String nomeLivro1 = scan.next();
        System.out.println("Digite o autor do livro " + idLivro + ": ");
        String nomeAutor1 = scan.next();
        System.out.println("Digite o ano de lancamento do livro " + idLivro + ": ");
        int anoLancamentoLivro1 = scan.nextInt();
        System.out.println("Digite o preco do livro " + idLivro + ": ");
        double precoLivro1 = scan.nextDouble();
        System.out.println("Digite a quantidade de paginas do livro " + idLivro + ": ");
        int numPagLivro1 = scan.nextInt();

        Livro livro1 = new Livro(nomeLivro1, nomeAutor1, anoLancamentoLivro1, precoLivro1, numPagLivro1);

        idLivro++;
        System.out.println("Digite o titulo do livro " + idLivro + ": ");
        String nomeLivro2 = scan.next();
        System.out.println("Digite o autor do livro " + idLivro + ": ");
        String nomeAutor2 = scan.next();
        System.out.println("Digite o ano de lancamento do livro " + idLivro + ": ");
        int anoLancamentoLivro2 = scan.nextInt();
        System.out.println("Digite o preco do livro " + idLivro + ": ");
        double precoLivro2 = scan.nextDouble();
        System.out.println("Digite a quantidade de paginas do livro " + idLivro + ": ");
        int numPagLivro2 = scan.nextInt();

        Livro livro2 = new Livro(nomeLivro2, nomeAutor2, anoLancamentoLivro2, precoLivro2, numPagLivro2);

        idLivro++;
        System.out.println("Digite o titulo do livro " + idLivro + " :");
        String nomeLivro3 = scan.next();
        System.out.println("Digite o autor do livro " + idLivro + ": ");
        String nomeAutor3 = scan.next();
        System.out.println("Digite o ano de lancamento do livro " + idLivro + ": ");
        int anoLancamentoLivro3 = scan.nextInt();
        System.out.println("Digite o preco do livro " + idLivro + ": ");
        double precoLivro3 = scan.nextDouble();
        System.out.println("Digite a quantidade de paginas do livro " + idLivro + ": ");
        int numPagLivro3 = scan.nextInt();

        Livro livro3 = new Livro(nomeLivro3, nomeAutor3, anoLancamentoLivro3, precoLivro3, numPagLivro3);

        System.out.println("O preco por pagina do livro " + livro1.getTitulo() + ": R$" + livro1.calcularPrecoPorPagina());
        System.out.println("O preco por pagina do livro " + livro2.getTitulo() + ": R$" + livro2.calcularPrecoPorPagina());
        System.out.println("O preco por pagina do livro " + livro3.getTitulo() + ": R$" + livro3.calcularPrecoPorPagina());

        System.out.println("Informacoes dos clientes: ");
        cliente1.imprimeCliente();
        System.out.println("----------------------------");
        cliente2.imprimeCliente();
        System.out.println("----------------------------");
        cliente3.imprimeCliente();
        System.out.println();
        System.out.println("Informacoes dos livros: ");
        livro1.imprimeLivro();
        System.out.println("----------------------------");
        livro2.imprimeLivro();
        System.out.println("----------------------------");
        livro3.imprimeLivro();
    }
}
