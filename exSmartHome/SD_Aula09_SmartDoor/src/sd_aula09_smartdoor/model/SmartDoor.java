package sd_aula09_smartdoor.model;

import java.io.Serializable;

public class SmartDoor implements Serializable {

    private String password;
    private boolean opened;

    public SmartDoor() {
        opened = false;
        password = "1234";
    }

    public synchronized String getPassword() {
        return password;
    }

    public synchronized void setPassword(String password) {
        this.password = password;
    }

    public synchronized boolean isOpened() {
        return opened;
    }

    public synchronized void setOpened(boolean opened) {
        this.opened = opened;
    }

}
