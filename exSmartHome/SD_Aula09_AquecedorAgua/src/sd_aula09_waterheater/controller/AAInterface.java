package sd_aula09_waterheater.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import sd_aula09_waterheater.model.AquecedorAgua;


public interface AAInterface  extends Remote {

    void changeTemperature(float temp) throws RemoteException;

    void turnOffOn() throws RemoteException;
    
    AquecedorAgua getAquecedor () throws RemoteException;
    
}
