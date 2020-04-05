package br.uam.bmoritani.exemplormi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ExemploRMI {
        
    public static void main(String[] args) throws RemoteException{
        Registry registro=null;
        try {
            
            MinhaCalculadora calc = new MinhaCalculadora();
            Remote remote = UnicastRemoteObject.exportObject(calc,0);
            registro = LocateRegistry.createRegistry(1099);
            registro.rebind("calculadora", remote);
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }

}
