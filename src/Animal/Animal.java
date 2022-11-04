package Animal;

public class Animal {
    private int membros;

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("membros=").append(membros);
        sb.append('}');
        return sb.toString();
    }
}
