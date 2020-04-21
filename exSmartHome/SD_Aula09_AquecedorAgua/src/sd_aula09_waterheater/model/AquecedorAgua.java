package sd_aula09_waterheater.model;

import java.io.Serializable;

public class AquecedorAgua implements Serializable{
    
    private float temperature;
    private boolean powerButton;

    public AquecedorAgua() {
        this.temperature = 35;
        this.powerButton = false;
    }
    
    public synchronized float getTemperature() {
        return temperature;
    }

    public synchronized void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public synchronized boolean isPowerButton() {
        return powerButton;
    }

    public synchronized void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }
}
