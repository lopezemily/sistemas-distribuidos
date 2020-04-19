package sd_aula09_light.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import sd_aula09_light.model.Light;


public class LightRMI {
      public static void main(String[] args) throws RemoteException{
        Registry registro=null;
        try {
            Light light = new Light();
            
            Light_Controller controller = new Light_Controller(light);
            Remote remote = UnicastRemoteObject.exportObject(controller,0);
            registro = LocateRegistry.createRegistry(10002);
            registro.rebind("Light", remote);
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }
}
