package jokenpo.jogo;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jokenpo.view.JokenpoPrincipal;
import jokenpo.rmi.ServidorSala;

public class JogadorRemoto extends Jogador {

    private final ServidorSala servidorJogo;
    private final DadosJogador dados;

    public JogadorRemoto(ServidorSala servidorJogo, DadosJogador adversario) {
        this.servidorJogo = servidorJogo;
        this.dados = adversario;
    }

    @Override
    public OpcJogada jogar() {
        OpcJogada jogada = OpcJogada.Pedra;

        //Bloco para fazer retentativas em caso de do adversario não ter realizado uma jogada
        boolean recebido = false;
        int tentativas = 10;

        do {
            tentativas--;

            try {
                jogada = servidorJogo.receberJogada(dados);
                recebido = true;
            } catch (RemoteException ex) {
                System.out.println("Esperando jogada");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex1) {
                    Logger.getLogger(JokenpoPrincipal.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }

        } while (recebido == false && tentativas >= 0);

        return jogada;
    }

    @Override
    public DadosJogador getDadosJogador() {
        return dados;
    }

}
