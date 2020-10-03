import model.machine.Machine;
import model.machine.car.Car;
import service.machine.MachineService;
import service.machine.MachineServiceImpl;
import service.machine.car.CarService;
import service.machine.car.CarServiceImpl;
import service.machine.update.MachineServiceUpdateImpl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Example {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        start(new MachineServiceImpl());
//        start(new MachineServiceUpdateImpl());
        System.out.println("MachineServiceImpl");
        startWithProps("machine");
        System.out.println("MachineServiceUpdateImpl");
        startWithProps("update");
    }

    private static void startWithProps(String name) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Machine machine = new Car();
        Properties props = new Properties();
        props.load(Example.class.getResourceAsStream("props.properties"));
        CarService carService = new CarServiceImpl(
                (MachineService<Machine>) Class.forName(
                        String.valueOf(props.get(name)))
                        .getDeclaredConstructor().newInstance());
        printInfo("BEFORE", machine);
        carService.run((Car) machine);
        printInfo("AFTER", machine);
    }

    private static void start(MachineService machineService) {
        Machine machine = new Car();
        System.out.println(machineService.getClass().getSimpleName());
        CarService carService = new CarServiceImpl(machineService);
        printInfo("BEFORE", machine);
        carService.run((Car) machine);
        printInfo("AFTER", machine);
    }

    private static void printInfo(String time, Machine machine) {
        System.out.println(time);
        System.out.println("TV :: " + machine.isTv());
        System.out.println("Wi-Fi :: " + machine.isWiFi());
        System.out.println("RUNNING? :: " + machine.isRunning());
    }

}
