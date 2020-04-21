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

    public synchronized float getTemperature() {
        return temperature;
    }

    public synchronized void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public synchronized boolean isWind() {
        return wind;
    }

    public synchronized void setWind(boolean wind) {
        this.wind = wind;
    }

    public synchronized boolean isPowerButton() {
        return powerButton;
    }

    public synchronized void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }
}
