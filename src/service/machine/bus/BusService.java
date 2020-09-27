package service.machine.bus;

import model.machine.bus.Bus;
import service.machine.MachineService;

public interface BusService extends MachineService<Bus> {

    void openCloseDoors(Bus bus);

}
