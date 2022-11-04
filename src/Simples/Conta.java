package Simples;

public class Conta {
    private String banco;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public boolean deposito(double valor) {
        setSaldo(saldo + valor);
        return true;
    }

    public boolean saque(double valor) {
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("banco='").append(banco).append('\'');
        sb.append(", agencia=").append(agencia);
        sb.append(", numeroConta=").append(numeroConta);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
