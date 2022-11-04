package Ambiente;

public class Cozinha extends Ambiente {
    private boolean microondas;

    public boolean isMicroondas() {
        return microondas;
    }

    public void setMicroondas(boolean microondas) {
        this.microondas = microondas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cozinha{");
        sb.append("microondas=").append(microondas);
        sb.append('}');
        return sb.toString();
    }
}
