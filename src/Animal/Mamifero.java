package Animal;

public class Mamifero extends Animal {
    private int numCrias;

    public int getNumCrias() {
        return numCrias;
    }

    public void setNumCrias(int numCrias) {
        this.numCrias = numCrias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mamifero{");
        sb.append("numCrias=").append(numCrias);
        sb.append('}');
        return sb.toString();
    }
}
