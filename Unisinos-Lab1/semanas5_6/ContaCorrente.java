package semanas5_6;

public class ContaCorrente {

    private int NumeroConta;
    private double SaldoConta;

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        SaldoConta = saldoConta;
    }

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        c1.setNumeroConta(1234);
        c1.setSaldoConta(100.00);

        ContaCorrente c2 = new ContaCorrente();
        c2.setNumeroConta(8765);
        c2.setSaldoConta(-98.00);

        ContaCorrente c3 = new ContaCorrente();
        c3.setNumeroConta(3342);
        c3.setSaldoConta(3445.80);
    }

}
