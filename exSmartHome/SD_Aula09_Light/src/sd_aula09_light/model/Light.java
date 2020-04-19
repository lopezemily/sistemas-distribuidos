package sd_aula09_light.model;

import java.io.Serializable;

public class Light implements Serializable {

    private int intensity;
    private boolean powerButton;

    public Light() {
        this.intensity = 10;
        this.powerButton = false;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public boolean isPowerButton() {
        return powerButton;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }

}
