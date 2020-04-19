package sd_aula09_waterheater.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import sd_aula09_waterheater.model.AquecedorAgua;

public class AARMI {
      public static void main(String[] args) throws RemoteException{
        Registry registro=null;
        try {
            AquecedorAgua aa = new AquecedorAgua();
            
            AA_Controller controller = new AA_Controller(aa);
            Remote remote = UnicastRemoteObject.exportObject(controller,0);
            registro = LocateRegistry.createRegistry(10004);
            registro.rebind("AquecedorAgua", remote);
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }
}
