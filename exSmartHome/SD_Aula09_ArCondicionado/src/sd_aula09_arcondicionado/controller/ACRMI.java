package sd_aula09_arcondicionado.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import sd_aula09_arcondicionado.model.ArCondicionado;

public class ACRMI {
     public static void main(String[] args) throws RemoteException{
        Registry registro=null;
        try {
            ArCondicionado ac = new ArCondicionado();
            
            AC_Controller controller = new AC_Controller(ac);
            Remote remote = UnicastRemoteObject.exportObject(controller,0);
            registro = LocateRegistry.createRegistry(10003);
            registro.rebind("AC", remote);
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }
}
