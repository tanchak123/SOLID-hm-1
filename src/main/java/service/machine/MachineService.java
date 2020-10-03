package service.machine;

import model.machine.Machine;

public interface MachineService<T extends Machine> {

    void run(T t);

    void stop(T t);

}
