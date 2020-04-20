package sd_aula09_light.controller;

import java.rmi.RemoteException;
import sd_aula09_light.model.Light;

public class Light_Controller implements LightInterface {

    private Light lig;

    public Light_Controller(Light lig) throws RemoteException {
        this.lig = lig;
    }
        
    @Override
    public void turnOffOn() throws RemoteException{
        System.out.println("Luz: turnOffOn foi chamado");
        if (lig.isPowerButton()) {
            lig.setPowerButton(false);
        } else {
            lig.setPowerButton(true);
        }
    }

    @Override
    public void changeIntensity(int intensity) throws RemoteException {
        System.out.println("Luz: changeIntensity foi chamado");
        lig.setIntensity(intensity);
    }

    @Override
    public Light getLight() throws RemoteException {
        System.out.println("Luz: getLight foi chamado");
        return lig;
    }    
}
