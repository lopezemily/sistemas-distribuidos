package calc;

import java.io.Serializable;

public class Resultado implements Serializable {

    private float resultado;
    private boolean sucesso;
    private String msg;

    public Resultado(float resultado, boolean sucesso, String msg) {
        this.resultado = resultado;
        this.sucesso = sucesso;
        this.msg = msg;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
