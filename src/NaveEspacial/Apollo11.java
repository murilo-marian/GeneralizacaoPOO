package NaveEspacial;

public class Apollo11 extends NaveEspacial {
    private String tipoCombustivel;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Apollo11{");
        sb.append("tipoCombustivel='").append(tipoCombustivel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
