package calc;

import java.io.Serializable;

public class Requisicao implements Serializable {

    private char operacao;
    private float x;
    private float y;

    public Requisicao(char operacao, float x, float y) {
        this.operacao = operacao;
        this.x = x;
        this.y = y;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

}
