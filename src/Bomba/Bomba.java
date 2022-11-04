package Bomba;

public class Bomba {
    private double totalLitros;
    private float valorLitro;

    public boolean abastecerPorLitro(int litros) {
        return true;
    }

    public boolean abastecerPorValor(double valor) {
        return true;
    }

    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(double totalLitros) {
        this.totalLitros = totalLitros;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bomba{");
        sb.append("totalLitros=").append(totalLitros);
        sb.append(", valorLitro=").append(valorLitro);
        sb.append('}');
        return sb.toString();
    }
}
