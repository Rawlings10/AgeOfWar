package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class GameEvents {

    private List<Observer> observer;

    public GameEvents(){
        observer = new ArrayList<>();
    }

    public void addObserver(Observer o){
        observer.add(o);
    }

    public void removeObserver(Observer o){
        observer.remove(o);
    }

    public void notifyObserver(String message){
        for (Observer o : observer){
            o.update(message);
        }
    }

    public void performGameEvent(String eventMessage) {
        notifyObserver(eventMessage);
    }
}
