package Xadrez;

public class Torre extends Peca {
    public boolean mover(int linha, int coluna) {
        return linha == getLinha() || coluna == getColuna();
    }
}
