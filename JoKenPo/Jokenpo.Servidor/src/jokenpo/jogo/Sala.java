package jokenpo.jogo;

import java.rmi.RemoteException;
import java.util.HashMap;
import jokenpo.jogo.DadosJogador;
import jokenpo.jogo.OpcJogada;
import jokenpo.rmi.ServidorSala;

public class Sala implements ServidorSala{
    //Map do id do jogador para a última jogada dele
    private final HashMap<String, OpcJogada> mapJogada = new HashMap();

    @Override
    public synchronized void enviarOpcJogada(DadosJogador jogador, OpcJogada jogada) throws RemoteException {
        //Adiciona no map o id e a jogada escolhida
        mapJogada.put(jogador.getId(), jogada);
    }

    @Override
    public synchronized OpcJogada receberJogada(DadosJogador jogador) throws RemoteException {
        //se uma jogada for sido feita, recebe a opção feita na jogada do adversario
        if(mapJogada.containsKey(jogador.getId())){
            OpcJogada jogada = mapJogada.get(jogador.getId());
            //apos pegar a jogada, remove do map a jogada do adversario
            mapJogada.remove(jogador.getId());
            
            return jogada;
        } else {
            throw new RemoteException("A jogada ainda não foi feita");
        }
    }
    
}
