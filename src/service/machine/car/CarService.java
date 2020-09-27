package service.machine.car;
import model.machine.Machine;
import model.machine.car.Car;
import service.machine.MachineService;

public interface CarService extends MachineService<Car> {

    void openCloseRoof(Car car);

    void nitroTurn(Car car);
}
