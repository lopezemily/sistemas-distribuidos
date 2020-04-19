package sd_aula09_smartdoor.controller;

import java.rmi.RemoteException;
import sd_aula09_smartdoor.model.SmartDoor;

public class SmartDoor_Controller implements SmartDoorInterface {

    private SmartDoor sd;

    public SmartDoor_Controller(SmartDoor sd) throws RemoteException {
        this.sd = sd;
    }

    @Override
    public boolean checkPassword(String pwd) throws RemoteException {
        System.out.println("checkPassword foi chamado");
        if (pwd.equals(sd.getPassword())) {
            sd.setOpened(true);
            return true;
        }
        return false;
    }

    @Override
    public void closeDoor() throws RemoteException {
        System.out.println("closeDoor foi chamado");
        this.sd.setOpened(false);
    }

    @Override
    public SmartDoor getSmartDoor() throws RemoteException {
        System.out.println("getSmartDoor foi chamado");
        return sd;
    }
}
