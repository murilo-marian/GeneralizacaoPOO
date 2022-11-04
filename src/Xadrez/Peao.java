package Xadrez;

public class Peao extends Peca {
    public boolean mover(int linha, int coluna) {
        return (isCor()) && (linha == (getLinha() + 1)) && (coluna == getColuna());
    }
}
