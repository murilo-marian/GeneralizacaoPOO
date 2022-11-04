package Ambiente;

public class Sala extends Ambiente {
    private boolean tv;

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sala{");
        sb.append("tv=").append(tv);
        sb.append('}');
        return sb.toString();
    }
}
