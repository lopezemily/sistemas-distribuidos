package sd_aula09_smarttv.model;

import java.io.Serializable;

public class SmartTV implements Serializable {

    private int channel;
    private int volume;
    private boolean powerButton;

    public SmartTV() {
        this.channel = 12;
        this.volume = 12;
        this.powerButton = false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerButton() {
        return powerButton;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }

}
