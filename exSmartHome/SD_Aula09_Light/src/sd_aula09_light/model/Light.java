package sd_aula09_light.model;

import java.io.Serializable;

public class Light implements Serializable {

    private int intensity;
    private boolean powerButton;

    public Light() {
        this.intensity = 10;
        this.powerButton = false;
    }

    public synchronized int getIntensity() {
        return intensity;
    }

    public synchronized void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public synchronized boolean isPowerButton() {
        return powerButton;
    }

    public synchronized void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }

}
