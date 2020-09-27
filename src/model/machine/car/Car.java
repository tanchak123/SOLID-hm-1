package model.machine.car;

import model.machine.Machine;

public class Car extends Machine {
    private boolean isNitro = false;
    private boolean isRoofOpen = false;

    public boolean isNitro() {
        return isNitro;
    }

    public void setNitro(boolean nitro) {
        isNitro = nitro;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        isRoofOpen = roofOpen;
    }
}
