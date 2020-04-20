package sd_aula09_waterheater.controller;

import java.rmi.RemoteException;
import sd_aula09_waterheater.model.AquecedorAgua;

public class AA_Controller implements AAInterface {

    private AquecedorAgua aa;

    public AA_Controller(AquecedorAgua aa) {
        this.aa = aa;
    }

    @Override
    public void turnOffOn() throws RemoteException {
        System.out.println("Aquecedor: turnOffOn foi chamado");
        if (aa.isPowerButton()) {
            aa.setPowerButton(false);
        } else {
            aa.setPowerButton(true);
        }
    }

    @Override
    public void changeTemperature(float temp) throws RemoteException {
        System.out.println("Aquecedor: changeTemperature foi chamado");
        aa.setTemperature(temp);
    }

    @Override
    public AquecedorAgua getAquecedor() throws RemoteException {
        System.out.println("Aquecedor: getAquecedor foi chamado");
        return aa;
    }
}
