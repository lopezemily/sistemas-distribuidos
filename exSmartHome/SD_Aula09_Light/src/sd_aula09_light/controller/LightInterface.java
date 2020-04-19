package sd_aula09_light.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import sd_aula09_light.model.Light;


public interface LightInterface  extends Remote {

    void changeIntensity(int intensity) throws RemoteException;

    void turnOffOn()throws RemoteException;
    
    Light getLight () throws RemoteException;
    
}
