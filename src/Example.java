import model.machine.Machine;
import model.machine.car.Car;
import service.machine.MachineService;
import service.machine.MachineServiceImpl;
import service.machine.car.CarService;
import service.machine.car.CarServiceImpl;
import service.machine.update.MachineServiceUpdateImpl;

public class Example {
    public static void main(String[] args) {
        Machine machine = new Car();
        CarService carService = new CarServiceImpl(new MachineServiceImpl());
        carService.run((Car)machine);
        System.out.printf("MachineServiceImpl: \nRUN\nTV: %s \nWi-Fi %s\nSTOP\n", machine.isTv(), machine.isWiFi());
        carService.stop((Car)machine);
        carService = new CarServiceImpl(new MachineServiceUpdateImpl());
        carService.run((Car) machine);
        System.out.printf("MachineServiceUpdateImpl: \nRUN\nTV: %s \nWi-Fi %s\n", machine.isTv(), machine.isWiFi());
        carService.stop((Car) machine);
        System.out.printf("STOP: \nTV: %s \nWi-Fi %s\n", machine.isTv(), machine.isWiFi());

    }

}
