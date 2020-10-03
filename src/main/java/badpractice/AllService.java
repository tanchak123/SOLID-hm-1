package badpractice;

public interface AllService<T> {

    void openCloseRoof(T t);

    void nitroTurn(T t);

    void run(T t);

    void stop(T t);
}
