package Simples;

public class ContaSimples extends Conta {
    private double saldoPoupanca;

    public boolean depositoPoupanca(double valor) {
        setSaldoPoupanca(getSaldoPoupanca() + valor);
        return true;
    }

    public boolean saquePoupanca(double valor) {
        if (getSaldoPoupanca() > valor) {
            setSaldoPoupanca(getSaldoPoupanca() - valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaEspecial{");
        sb.append("saldoPoupanca=").append(saldoPoupanca);
        sb.append('}');
        return sb.toString();
    }
}
