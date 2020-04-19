package sd_aula09_smartdoor.model;

import java.io.Serializable;

public class SmartDoor implements Serializable {

    private String password;
    private boolean opened;

    public SmartDoor() {
        opened = false;
        password = "1234";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

}
