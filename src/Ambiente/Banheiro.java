package Ambiente;

public class Banheiro extends Ambiente {
    private boolean banheira;

    public boolean isBanheira() {
        return banheira;
    }

    public void setBanheira(boolean banheira) {
        this.banheira = banheira;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banheiro{");
        sb.append("banheira=").append(banheira);
        sb.append('}');
        return sb.toString();
    }
}
