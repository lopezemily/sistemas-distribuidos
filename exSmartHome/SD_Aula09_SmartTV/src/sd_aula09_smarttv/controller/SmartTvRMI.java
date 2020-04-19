
package sd_aula09_smarttv.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import sd_aula09_smarttv.model.SmartTV;


public class SmartTvRMI {
     public static void main(String[] args) throws RemoteException{
        Registry registro=null;
        try {
            SmartTV tv = new SmartTV();
            
            SmartTV_Controller controller = new SmartTV_Controller(tv);
            Remote remote = UnicastRemoteObject.exportObject(controller,0);
            registro = LocateRegistry.createRegistry(10000);
            registro.rebind("SmartTV", remote);
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }
}
