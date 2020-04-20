package sd_aula09_arcondicionado.controller;

import java.rmi.RemoteException;
import sd_aula09_arcondicionado.model.ArCondicionado;

public class AC_Controller implements ACInterface {

    private ArCondicionado ac;

    public AC_Controller(ArCondicionado ac) {
        this.ac = ac;
    }

    @Override
    public void turnOffOn() throws RemoteException {
        System.out.println("Ar condicionado: turnOffOn foi chamado");
        if (ac.isPowerButton()) {
            ac.setPowerButton(false);
        } else {
            ac.setPowerButton(true);
        }
    }

    @Override
    public void turnWindOffOn() throws RemoteException {
        System.out.println("Ar condicionado: turnWindOffOn foi chamado");
        if (ac.isWind()) {
            ac.setWind(false);
        } else {
            ac.setWind(true);
        }
    }
    
    @Override
    public void changeTemperature(float temp) throws RemoteException{
        System.out.println("Ar condicionado: changeTemperature foi chamado");
        ac.setTemperature(temp);   
    }

    @Override
    public ArCondicionado getArCondicionado() throws RemoteException {
        System.out.println("Ar condicionado: getArCondicionado foi chamado");
        return ac;
    }
}
