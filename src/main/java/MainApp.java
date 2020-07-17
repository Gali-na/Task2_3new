import java.util.ArrayList;

/**
 * - Создать класс Machine с методами public abstract void doWork()
 * и public abstract void stopWork().
 * - Создать классы Track, Bulldozer, Excavator которые унаследуют Machine.
 * - Переопределить метод doWork() и вывести в консоль строку с сообщением что та или иная
 * машина начала свою работу.
 * - Переопределить метод stopWork() и вывести в консоль строку с сообщением что та или иная
 * машина прекратила свою работу.
 * - В классе Main создать добавить по одному екземпляру каждого класса.
 * - Отправить все машини на работу и остановить работу всех машин.
 */

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Track track = new Track();
        ArrayList<Machine> machines = new ArrayList<Machine>();
        machines.add(excavator);
        machines.add(bulldozer);
        machines.add(track);
        for (Machine car : machines) {
            car.doWork();
            car.stopWork();
        }
    }
}
