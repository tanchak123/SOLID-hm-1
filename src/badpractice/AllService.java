package badpractice;

import model.machine.car.Car;

public interface AllService<T> {

    void openCloseRoof(T t);

    void nitroTurn(T t);

    void run(T t);

    void stop(T t);
}
