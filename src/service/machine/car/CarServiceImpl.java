package service.machine.car;

import model.machine.Machine;
import model.machine.car.Car;
import service.machine.MachineService;

public class CarServiceImpl implements CarService {

    MachineService<Machine> machineService;

    public CarServiceImpl(MachineService machineService) {
        this.machineService = machineService;
    }


    @Override
    public void openCloseRoof(Car car) {
        car.setRoofOpen(!car.isRoofOpen());
    }

    @Override
    public void nitroTurn(Car car) {
        car.setRunning(!car.isRunning());
    }

    @Override
    public void run(Car car) {
        machineService.run(car);
    }

    @Override
    public void stop(Car car) {
        machineService.stop(car);
    }
}
