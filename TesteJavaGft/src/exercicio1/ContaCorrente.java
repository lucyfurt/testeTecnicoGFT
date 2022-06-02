package exercicio1;

public class ContaCorrente  extends Conta{


    @Override
    public void rendimento() {
        System.out.println("saldo:" + this.getSaldo() * 0.03);
    }
}
