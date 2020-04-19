package sd_aula09_arcondicionado.model;

import java.io.Serializable;

public class ArCondicionado implements Serializable {

    private float temperature;
    private boolean wind;
    private boolean powerButton;

    public ArCondicionado() {
        this.temperature = 23;
        this.wind = false;
        this.powerButton = false;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public boolean isWind() {
        return wind;
    }

    public void setWind(boolean wind) {
        this.wind = wind;
    }

    public boolean isPowerButton() {
        return powerButton;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }
}
