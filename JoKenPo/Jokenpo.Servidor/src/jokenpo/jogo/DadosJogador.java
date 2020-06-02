package jokenpo.jogo;

import java.io.Serializable;

public class DadosJogador implements Serializable {

    private static final long serialVersionUID = 3402249574314499221L;
    private final String id;
    private final String nome;
    private int pontuacao;
    private boolean emSessao;

    public DadosJogador(String id, String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.id = id;
        this.emSessao = false;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void adicionarPonto() {
        this.pontuacao++;
    }

    public void setEmSessao(boolean emSessao) {
        this.emSessao = emSessao;
    }

    public boolean isEmSessao() {
        return emSessao;
    }

}
