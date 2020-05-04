package jokenpo.model;

public class Match {
    private final String idJogador1;
    private final String idJogador2;

    public Match(String idJogador1, String idJogador2) {
        this.idJogador1 = idJogador1;
        this.idJogador2 = idJogador2;
    }

    public String getIdJogador1() {
        return idJogador1;
    }

    public String getIdJogador2() {
        return idJogador2;
    }
    
}
