package Ambiente;

public class Quarto extends Ambiente {
    private int capacidade;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quarto{");
        sb.append("capacidade=").append(capacidade);
        sb.append('}');
        return sb.toString();
    }
}
