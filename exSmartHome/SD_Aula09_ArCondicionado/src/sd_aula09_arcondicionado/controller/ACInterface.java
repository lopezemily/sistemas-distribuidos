package sd_aula09_arcondicionado.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import sd_aula09_arcondicionado.model.ArCondicionado;

public interface ACInterface  extends Remote {

    void changeTemperature(float temp) throws RemoteException;

    void turnOffOn() throws RemoteException;

    void turnWindOffOn() throws RemoteException;
    
    ArCondicionado getArCondicionado () throws RemoteException;
    
}
