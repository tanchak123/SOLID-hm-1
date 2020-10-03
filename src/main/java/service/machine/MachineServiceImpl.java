package service.machine;

import model.machine.Machine;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public void run(Machine machine) {
        machine.setRunning(true);

    }

    @Override
    public void stop(Machine machine) {
        machine.setRunning(false);
    }
}
