package sd_aula09_smarttv.controller;

import java.rmi.RemoteException;
import sd_aula09_smarttv.model.SmartTV;

public class SmartTV_Controller implements SmartTvInterface {

    private SmartTV stv;

    public SmartTV_Controller(SmartTV stv) {
        this.stv = stv;
    }
        
    @Override
    public synchronized void turnOffOn() throws RemoteException {
        System.out.println("TV: turnOffOn foi chamado");
        if (stv.isPowerButton()) {
            stv.setPowerButton(false);
        } else {
            stv.setPowerButton(true);
        }
    }

    @Override
    public synchronized void changeChannel(int channel) throws RemoteException {
        System.out.println("TV: changeChannel foi chamado");
        stv.setChannel(channel);
    }
    
    @Override
    public synchronized void changeVolume(int volume) throws RemoteException {
        System.out.println("TV: changeVolume foi chamado");
        stv.setVolume(volume);
    }

    @Override
    public synchronized SmartTV getSmartTV() throws RemoteException {
        System.out.println("TV: getSmartTV foi chamado");
        return stv;
    }
}
