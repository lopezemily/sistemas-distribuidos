package sd_aula09_smartdoor.controller;

import java.rmi.RemoteException;
import sd_aula09_smartdoor.model.SmartDoor;

public class SmartDoor_Controller implements SmartDoorInterface {

    private SmartDoor sd;

    public SmartDoor_Controller(SmartDoor sd) throws RemoteException {
        this.sd = sd;
    }

    @Override
    public synchronized boolean checkPassword(String pwd) throws RemoteException {
        System.out.println("Porta: checkPassword foi chamado");
        if (pwd.equals(sd.getPassword())) {
            sd.setOpened(true);
            return true;
        }
        return false;
    }

    @Override
    public synchronized void closeDoor() throws RemoteException {
        System.out.println("Porta: closeDoor foi chamado");
        this.sd.setOpened(false);
    }

    @Override
    public synchronized SmartDoor getSmartDoor() throws RemoteException {
        System.out.println("Porta: getSmartDoor foi chamado");
        return sd;
    }
}
