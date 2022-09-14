import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public List<Observer> observers = new ArrayList<>();

    public void register(Observer... observers) {

        for (Observer observer : observers) {
            this.observers.add(observer);
        }
    }

    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    public void publish(String msg) {

        observers.forEach(observer -> {
            observer.publish(msg);
        });

    }


}