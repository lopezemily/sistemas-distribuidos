package sd_aula09_smarttv.controller;

import java.rmi.RemoteException;
import sd_aula09_smarttv.model.SmartTV;

public class SmartTV_Controller implements SmartTvInterface {

    private SmartTV stv;

    public SmartTV_Controller(SmartTV stv) {
        this.stv = stv;
    }
        
    @Override
    public void turnOffOn() throws RemoteException {
        System.out.println("turnOffOn foi chamado");
        if (stv.isPowerButton()) {
            stv.setPowerButton(false);
        } else {
            stv.setPowerButton(true);
        }
    }

    @Override
    public void changeChannel(int channel) throws RemoteException {
        System.out.println("changeChannel foi chamado");
        stv.setChannel(channel);
    }
    
    @Override
    public void changeVolume(int volume) throws RemoteException {
        System.out.println("changeVolume foi chamado");
        stv.setVolume(volume);
    }

    @Override
    public SmartTV getSmartTV() throws RemoteException {
        System.out.println("getSmartTV foi chamado");
        return stv;
    }
}
