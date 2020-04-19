package sd_aula09_smartdoor.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import sd_aula09_smartdoor.model.SmartDoor;

public class SmartDoorRMI {
     public static void main(String[] args) throws RemoteException{
        Registry registro=null;
        try {
            SmartDoor door = new SmartDoor();
            
            SmartDoor_Controller controller = new SmartDoor_Controller(door);
            Remote remote = UnicastRemoteObject.exportObject(controller,0);
            registro = LocateRegistry.createRegistry(10001);
            registro.rebind("SmartDoor", remote);
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }
}
