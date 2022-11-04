package NaveEspacial;

public class MilleninumFalcon extends Apollo11 {
    private float classeHiperPropulsor;

    public float getClasseHiperPropulsor() {
        return classeHiperPropulsor;
    }

    public void setClasseHiperPropulsor(float classeHiperPropulsor) {
        this.classeHiperPropulsor = classeHiperPropulsor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MilleninumFalcon{");
        sb.append("classeHiperPropulsor=").append(classeHiperPropulsor);
        sb.append('}');
        return sb.toString();
    }
}
