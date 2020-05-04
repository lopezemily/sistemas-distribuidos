package jokenpo.jogo;

import java.util.UUID;

public class JogadorCpu extends Jogador{
    
    private DadosJogador dados;
    
    public JogadorCpu(){
        this.dados = new DadosJogador(UUID.randomUUID().toString(), "CPU");
    }

    @Override
    public OpcJogada jogar() {
        //algoritmo para escolher um número entre 0 e 2
        int jogada = (int) (Math.random() * 3);
        //Converte o número em uma opção de jogada e retorna
        return OpcJogada.values()[jogada];
    }

    @Override
    public DadosJogador getDadosJogador() {
        return dados;
    }
}
