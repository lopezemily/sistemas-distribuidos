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

    public synchronized int getChannel() {
        return channel;
    }

    public synchronized void setChannel(int channel) {
        this.channel = channel;
    }

    public synchronized int getVolume() {
        return volume;
    }

    public synchronized void setVolume(int volume) {
        this.volume = volume;
    }

    public synchronized boolean isPowerButton() {
        return powerButton;
    }

    public synchronized void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }

}
