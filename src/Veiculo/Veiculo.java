package Veiculo;

public class Veiculo {
    private boolean moto;

    public boolean isMoto() {
        return moto;
    }

    public void setMoto(boolean moto) {
        this.moto = moto;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veiculo{");
        sb.append("moto=").append(moto);
        sb.append('}');
        return sb.toString();
    }
}
