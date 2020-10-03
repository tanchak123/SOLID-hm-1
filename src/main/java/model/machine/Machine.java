package model.machine;

public abstract class Machine {
    private static int counter = 0;
    private String entity = "Unknown";
    private int id = 0;
    private boolean isRunning = false;
    private boolean isWiFi;
    private boolean isTv;

    public Machine() {
        this.id = ++counter;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public boolean isWiFi() {
        return isWiFi;
    }

    public void setWiFi(boolean wiFi) {
        isWiFi = wiFi;
    }

    public boolean isTv() {
        return isTv;
    }

    public void setTv(boolean tv) {
        isTv = tv;
    }
}
