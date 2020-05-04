package jokenpo.jogo;

import javax.swing.JOptionPane;

//A classe representa uma rodada entro de uma sessao do jogo
public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        //Pede os dois jogadores para o jogo
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void jogar() {
        //Pede a jogada para os jogadores
        OpcJogada jogadaJ1 = jogador1.jogar();
        OpcJogada jogadaJ2 = jogador2.jogar();
        
        int vencedor = obterVencedor(jogadaJ1, jogadaJ2);
        adicionarPontoVencedor(vencedor);
    }

    private int obterVencedor(OpcJogada j1, OpcJogada j2) {
        //Lógica principal do jogo jokenpo, retornando o número do jogador vencedor
        if ((j1 == OpcJogada.Pedra && j2 == OpcJogada.Tesoura)
                || (j1 == OpcJogada.Tesoura && j2 == OpcJogada.Papel)
                || (j1 == OpcJogada.Papel && j2 == OpcJogada.Pedra)) {
            return 1;
        } else if (j1 == j2) {
            JOptionPane.showMessageDialog(null, "EMPATE!", "Resultado", JOptionPane.PLAIN_MESSAGE);
            return -1;
        }
        return 2;
    }
    
    private void adicionarPontoVencedor(int vencedor){
        if(vencedor == 1){
            jogador1.getDadosJogador().adicionarPonto();
        } else if(vencedor == 2){
            jogador2.getDadosJogador().adicionarPonto();
        }
    }
}
