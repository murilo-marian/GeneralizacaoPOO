package Ambiente;

public class Ambiente {
    private float area;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ambiente{");
        sb.append("area=").append(area);
        sb.append('}');
        return sb.toString();
    }
}
