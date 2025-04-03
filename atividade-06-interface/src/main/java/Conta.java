abstract class Conta implements iOperacao{
    private String numConta;
    private String agencia;
    private double saldo;


    public Conta(){

    }
    public Conta(String numConta, String agencia, double saldo) {
        setNumConta(numConta);
        setAgencia(agencia);
        setSaldo(saldo);
    }

    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
