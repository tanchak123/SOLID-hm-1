package service.machine.bus;


import model.machine.bus.Bus;

public class BusServiceImpl implements BusService {

    @Override
    public void openCloseDoors(Bus bus) {
        bus.setDoorOpen(!bus.isDoorOpen());

    }

    @Override
    public void run(Bus bus) {
        bus.setRunning(true);
    }

    @Override
    public void stop(Bus bus) {
        bus.setRunning(false);
    }
}
