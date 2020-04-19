package sd_aula09_waterheater.model;

import java.io.Serializable;

public class AquecedorAgua implements Serializable{
    
    private float temperature;
    private boolean powerButton;

    public AquecedorAgua() {
        this.temperature = 35;
        this.powerButton = false;
    }
    
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public boolean isPowerButton() {
        return powerButton;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }
}
