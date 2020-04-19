package sd_aula09_smartdoor.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import sd_aula09_smartdoor.model.SmartDoor;


public interface SmartDoorInterface extends Remote {

    boolean checkPassword(String pwd) throws RemoteException;

    void closeDoor() throws RemoteException;
    
    SmartDoor getSmartDoor () throws RemoteException;
    
}
