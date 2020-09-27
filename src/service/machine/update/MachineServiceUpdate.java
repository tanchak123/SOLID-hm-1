package service.machine.update;

import model.machine.Machine;
import service.machine.MachineService;

public interface MachineServiceUpdate extends MachineService<Machine> {

    void wiFiOn(Machine machine);

    void tvOn(Machine machine);

}
