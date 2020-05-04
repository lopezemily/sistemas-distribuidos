package jokenpo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import jokenpo.jogo.Sala;
import jokenpo.jogo.Sessao;

public class Main {
    public static void main(String[] args) throws RemoteException{
        Registry registro=null;
        try {
            Sessao sessao = new Sessao();
            Sala sala = new Sala();
            
            Remote remoteSessao = UnicastRemoteObject.exportObject(sessao,0);
            Remote remoteSala = UnicastRemoteObject.exportObject(sala,0);
            
            registro = LocateRegistry.createRegistry(2210);
            
            registro.rebind("Sessao", remoteSessao);
            registro.rebind("Sala", remoteSala);
            
            System.out.println("O servidor de Jokenpo iniciou...");
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }

    
}
