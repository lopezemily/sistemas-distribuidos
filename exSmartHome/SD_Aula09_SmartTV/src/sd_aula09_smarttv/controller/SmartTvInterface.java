package sd_aula09_smarttv.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import sd_aula09_smarttv.model.SmartTV;

public interface SmartTvInterface extends Remote {

    void changeChannel(int channel) throws RemoteException;

    void changeVolume(int volume) throws RemoteException;

    void turnOffOn() throws RemoteException;
    
    SmartTV getSmartTV () throws RemoteException;
    
}
