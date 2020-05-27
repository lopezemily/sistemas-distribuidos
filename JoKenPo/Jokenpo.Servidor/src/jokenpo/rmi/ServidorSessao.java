package jokenpo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import jokenpo.jogo.DadosJogador;

//Oferece serviços para que os jogadores possam se registrar e encontrar adversarios
public interface ServidorSessao extends Remote {

    public void conectar(String id, String nome) throws RemoteException;

    public DadosJogador buscarAdversario(String id) throws RemoteException;
    
    public boolean jogadorEstaAtivo(String id) throws RemoteException;
    
    public void desconectar(String id) throws RemoteException;

}
