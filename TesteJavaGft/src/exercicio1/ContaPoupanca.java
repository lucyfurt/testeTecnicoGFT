package exercicio1;

public class ContaPoupanca extends Conta {


    @Override
    public void rendimento() {
        System.out.println("saldo:" + this.getSaldo() * 0.05);
    }
}

