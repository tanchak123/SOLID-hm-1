package service.machine.update;
import model.machine.Machine;

public class MachineServiceUpdateImpl implements MachineServiceUpdate {

    @Override
    public void wiFiOn(Machine machine) {
        machine.setWiFi(!machine.isWiFi());
    }

    @Override
    public void tvOn(Machine machine) {
        machine.setTv(!machine.isTv());
    }

    @Override
    public void run(Machine machine) {
        if (!machine.isRunning()) {
            machine.setRunning(true);
            wiFiOn(machine);
            tvOn(machine);
        }
    }

    @Override
    public void stop(Machine machine) {
        if (machine.isRunning()) {
            machine.setRunning(false);
            wiFiOn(machine);
            tvOn(machine);
        }
    }
}
