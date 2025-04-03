public class ContaPoupanca extends Conta{

    public ContaPoupanca(){

    }

    public ContaPoupanca(String numConta, String agencia, double saldo) {
        super(numConta, agencia, saldo);
    }

    @Override
    public void depositar(double valor){
        if(valor <= 0.0){
            System.out.println("Valor inválido");
        }else{
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    @Override
    public void sacar(double valor){
        double taxa = valor * 0.005;
        double novoSaldo = this.getSaldo() - valor - taxa;

        if(valor <= 0.0 || novoSaldo <0){
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.setSaldo(novoSaldo);

    }

    @Override
    public void obterValor(){
        System.out.println("Saldo da conta: R$" + this.getSaldo());
    }
}
