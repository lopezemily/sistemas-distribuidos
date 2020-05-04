package jokenpo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import jokenpo.jogo.DadosJogador;
import jokenpo.jogo.OpcJogada;

//Oferece serviços para que dois jogados troquem jogadas
public interface ServidorSala extends Remote{

    public void enviarOpcJogada(DadosJogador jogador, OpcJogada jogada) throws RemoteException;

    public OpcJogada receberJogada(DadosJogador jogador) throws RemoteException;
}
