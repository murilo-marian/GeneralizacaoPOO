package NaveEspacial;

public class NaveEspacial {
    private double velocidadeMaxima;

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NaveEspacial{");
        sb.append("velocidadeMaxima=").append(velocidadeMaxima);
        sb.append('}');
        return sb.toString();
    }
}
