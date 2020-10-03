package model.machine.bus;

import model.machine.Machine;

public class Bus extends Machine {
    private boolean doorOpen = false;

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }
}
