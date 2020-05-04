package jokenpo.jogo;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jokenpo.rmi.ServidorSala;

public class JogadorLocal extends Jogador {

    private DadosJogador dados;
    private ServidorSala servidorJogo;

    //Construtor para um jogo offline
    public JogadorLocal(String id, String nome) {
        this.dados = new DadosJogador(id, nome);
        this.servidorJogo = null;
    }

    //Construtor para um jogo online
    public JogadorLocal(String id, String nome, ServidorSala servidorJogo) {
        this.dados = new DadosJogador(id, nome);
        this.servidorJogo = servidorJogo;
    }

    @Override
    public OpcJogada jogar() {

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        int opcao;

        //Para uma jogada o jogador local recebe uma janela para escolher a jogada
        //Enquanto ele não escolher uma opção válida, a janela persiste
        while (true) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção de jogada", "Nova jogada",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
            if (opcao != -1) {
                break;
            }
        }

        //Converte o resultado da janela para uma opção de jogada
        OpcJogada jogada = OpcJogada.values()[opcao];

        //Se o construtor chamado for de um jogo online, a jogada é enviada para o servidor
        if (servidorJogo != null) {
            try {
                servidorJogo.enviarOpcJogada(dados, jogada);
            } catch (RemoteException ex) {
                Logger.getLogger(JogadorLocal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return jogada;
    }

    @Override
    public DadosJogador getDadosJogador() {
        return dados;
    }

}
