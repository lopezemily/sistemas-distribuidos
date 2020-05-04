package jokenpo.jogo;

//A sessao é um conjunto de rodadas
public class Sessao {

    private Jogador jogador1;
    private Jogador jogador2;
    private int numRodadas;

    public Sessao(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.numRodadas = 0;
    }

    public void novaRodada() {
        Jogo jogo = new Jogo(jogador1, jogador2);

        jogo.jogar();
        numRodadas++;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public int getNumRodadas() {
        return numRodadas;
    }

}
