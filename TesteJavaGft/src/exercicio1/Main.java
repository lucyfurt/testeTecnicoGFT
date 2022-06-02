package exercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("CONTA CORRENTE");
    Conta cc = new ContaCorrente();
    cc.setNumero(1234);
    cc.setTitular("Luciana");
    cc.setSaldo(100);
    cc.rendimento();

        System.out.println("minha conta é:" + cc.getNumero() + "com o nome" + cc.getTitular());

        System.out.println("CONTA POUPANCA");

        Conta cp = new ContaPoupanca();
        cp.setNumero(1234);
        cp.setTitular("Luciana");
        cp.setSaldo(100);
        cp.rendimento();

        System.out.println("minha conta é:" + cp.getNumero() + "com o nome" + cp.getTitular());
    }
}
