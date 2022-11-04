package Xadrez;

public class Peca {
    private int linha;
    private int coluna;
    private boolean cor;
    private int movimentos;

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public boolean isCor() {
        return cor;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(int movimentos) {
        this.movimentos = movimentos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Peca{");
        sb.append("linha=").append(linha);
        sb.append(", coluna=").append(coluna);
        sb.append(", cor=").append(cor);
        sb.append(", movimentos=").append(movimentos);
        sb.append('}');
        return sb.toString();
    }
}
